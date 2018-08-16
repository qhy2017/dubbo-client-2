package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.IUserService;

@RestController
public class DemoController {
	@Reference
	private IUserService userService;

	@RequestMapping("/getUserName")
	public String getUserName() {

		return userService.getUserName();

	}
}
