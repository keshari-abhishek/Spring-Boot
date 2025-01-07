package com.abhi.schedulingservice.jobs;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimeLoggerJob {
	
	private static final Logger log=LoggerFactory.getLogger(TimeLoggerJob.class);
	
	private static final SimpleDateFormat format= new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	public void logCurrentTime() {
		log.error("==========================================>");
		log.info("::::::::::"+format.format(new Date()));
	}
	

}
