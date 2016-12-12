package com.cdv.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdv.spring.service.MyService;

@RestController
@RequestMapping("api/my")
public class MyController {
	@Autowired
	private MyService myService;

	@RequestMapping(value = "/getName", method = RequestMethod.GET)
	public String getName() {
		return myService.getName();
	}
}
