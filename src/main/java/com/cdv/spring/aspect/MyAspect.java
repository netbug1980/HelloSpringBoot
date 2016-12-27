package com.cdv.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.cdv.spring.service.AbstractService;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect {
	@Pointcut("execution(** com.cdv.spring.service.AbstractService.run(..))")
	public void run() {
	}

	@Around("run()")
	public void introduceMyself(ProceedingJoinPoint pj) throws Throwable {
		Object obj = pj.getTarget();
		AbstractService ss = (AbstractService) obj;
		System.out.println("== My Name Is " + ss.getServiceName() + " ==");
		System.out.println(ss.isEnable());
		System.out.println(ss.getDefName());
		ss.doWork(ss.getDefName());

	}
}
