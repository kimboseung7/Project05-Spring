package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout") //중간 경로
public class LayoutController {
	
	@GetMapping("/exLayout1")
	public void ex1() {
		
	}

}
