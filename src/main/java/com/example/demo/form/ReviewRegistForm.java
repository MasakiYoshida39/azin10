package com.example.demo.form;

import java.sql.Date;

import lombok.Data;
//lombokのデータアノテーションでgetter、setter省略
@Data
public class ReviewRegistForm {
		private Integer restaurantId;
		private String userId;
		//来店日
		private Date visitDate;
		//評価
		private Integer rating;
		private String comment;
}

