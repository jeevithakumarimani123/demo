package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DemoApplication;

@RestController
@RequestMapping("/demo")
public class DemoController {

	public static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@GetMapping("/getDemo")
	public String getDemoController() {
		logger.info("Inside getDemoController");
		return "This is a demo controller";
	}
}