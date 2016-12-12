package com.cdv.spring;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cdv.spring.service.MyService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyApplication.class)
@WebAppConfiguration
public class MyServiceTest {
	@Autowired
	private MyService myService;

	@Test
	public void getName() {
		assertTrue(myService.getName().equals("Hello Spring Boot!"));
	}

}
