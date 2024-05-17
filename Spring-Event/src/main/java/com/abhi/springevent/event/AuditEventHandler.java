package com.abhi.springevent.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class AuditEventHandler {

	@EventListener
	@Async
	public void handelEvent(AuditEvent auditEvent) throws JsonProcessingException {
		System.out.println(new ObjectMapper()
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(auditEvent.getData()));
		
	}
}
