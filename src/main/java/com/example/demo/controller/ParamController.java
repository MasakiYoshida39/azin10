package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
//↓コントロールと認識させるためのアノテーション
@Controller
public class ParamController {
	
	//modelのやり方
	//Getリクエストを送るため
	@GetMapping("/welcome-m")
	//public Stringは変えられない
	//welcomeMなんでもOK
	//引数のmodelはなんでもOK
	public String welcomeM(Model model) {
		
		model.addAttribute("greeting", "Hello");
		model.addAttribute("welcome", "Welcome MVC (Model)");
		// テンプレートに welcome-spring.htmlを指定
	    //.htmlは省略可能
		return "welcome-mvc";
	}
	
	
	
	 //ModelAndViewのやり方
	//Getリクエストを送るため
	@GetMapping("/welcome-mv")
	//public Stringは変えられない
	//welcomeMｖなんでもOK
	//引数のmvはなんでもOK
	public ModelAndView welcomeMv(ModelAndView mv) {
		
		mv.addObject("greeting", "Hello");
		mv.addObject("welcome", "Welcome MVC (ModelAndView)");
		// テンプレートに welcome-spring.htmlを指定
	    //.htmlは省略可能
		mv.setViewName("welcome-mvc");
		
		return mv;
	}
}
