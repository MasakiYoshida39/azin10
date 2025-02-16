package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//↓コントロールと認識させるためのアノテーション
@Controller
public class HelloSpringController {
	@GetMapping("/wel")
	public String wel() {
		//HTML=test.html
		return  "test";
	}

}
