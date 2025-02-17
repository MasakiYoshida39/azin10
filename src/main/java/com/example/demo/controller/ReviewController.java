package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ReviewRegistForm;
//↓コントロールと認識させるためのアノテーション
@Controller
public class ReviewController {
	/*--- レビュー登録画面表示リクエスト ---*/
	@GetMapping("/show-review-form")
	public String showReviewForm() {
		return "regist-review";
	}

	/*--- レビュー登録リクエスト（登録画面より） ---*/
	@PostMapping("/regist-review")
	//formクラスのReviewRegistFormをformに格納
	public String registReview(@ModelAttribute ReviewRegistForm form) {
			//tostringが呼び出される
		System.out.println(form);		// 内容をチェック
		return "confirm-regist-review";
	}
	
	
	/*--- レビュー登録画面表示リクエスト（確認画面からの戻り） ---*/
	@PostMapping("/show-review-form-ret")
	public String showReviewFormRet(@ModelAttribute ReviewRegistForm form) {
		return "regist-review";
	}
	
	/*--- レビュー登録リクエスト（登録確認画面より） ---*/
	@PostMapping("/confirm-regist-review")
	public String confirmRegistReview(ReviewRegistForm form,
			Model model) {
		//
		// *** ここで from 内容で DB登録処理を行う ***
		//

		model.addAttribute("msg", "レビュー登録が完了しました。");
		
		return "complete-regist-review";
	}


	
}