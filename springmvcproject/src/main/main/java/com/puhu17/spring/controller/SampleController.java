package com.puhu17.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	public void SampleController() {
		System.out.println("!1221");
	}
	//hello 로 요청이 오면 hello라는 뷰 이름을 return, servlet-context.xml 파일의 viewResolver내용을 참조해서 위치 결정
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("hello", "헬로");
		return "hello";
	}
}
