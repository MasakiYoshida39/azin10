package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//↓コントロールと認識させるためのアノテーション
@Controller
public class WelcomeSpringController {
	//Getリクエストを送るため
	@GetMapping("/welcome")
	//public Stringは変えられない
	public String welcome() {
		// テンプレートに welcome-spring.htmlを指定
		//.htmlは省略可能
		return "welcome-spring";
	}

}
