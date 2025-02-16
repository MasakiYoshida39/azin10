package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//↓コントロールと認識させるためのアノテーション
@Controller
public class HelloSpringController {
	//Getリクエストを送るため
	@GetMapping("/hello")
	//public Stringは変えられない
	public String hello() {
		// テンプレートに hello-spring.html を指定
		//.htmlは省略可能
		return "hello-spring";
	}

}
