package com.abhi.springevent.event;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.abhi.springevent.model.LogData;

import jakarta.servlet.http.HttpServletRequest;

@Component
public class AuditEventPublisher {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void publishEvent(String message) {
		Map<String,String> dataMap=new LinkedHashMap<String,String>();
		HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		dataMap.put("host", request.getHeader("host"));
		dataMap.put("user-agent", request.getHeader("User-Agent"));
		dataMap.put("message", message);
		applicationEventPublisher.publishEvent(new AuditEvent<LogData>(LogData.builder().data(dataMap).build()));
		
	}

}
