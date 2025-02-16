package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//↓コントロールと認識させるためのアノテーション
@Controller
public class ParamController {
	//入力画面遷移
	@GetMapping("/input")
	public String input() {
		return "input";
	}
	
	///post-paramのポストからリクエストを受け取る
	@PostMapping("/post-param")
	public String postParam(@RequestParam String greeting,
			Model model) {
		//greetingをmGreetingに格納
		model.addAttribute("mGreeting", greeting);
		
		return "display";
	}

}