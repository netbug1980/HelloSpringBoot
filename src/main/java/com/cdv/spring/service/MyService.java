package com.cdv.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class MyService extends AbstractService {
	
	public MyService (){
		this.serviceName = "MyService";
	}
	
	public String getName() {
		return "Hello Spring Boot!";
	}

	@Override
	@Scheduled(initialDelay = 5 * 1000, fixedDelay = 60 * 1000)
	public void run() {

	}

	@Override
	public void doWork(String workName) {
		System.out.println("Do " + workName + " Work");
	}

	@Override
	@Value("${enable:false}")
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	@Override
	@Value("${defName:测试}")
	public void setDefName(String defName) {
		this.defName = defName;
	}
}
