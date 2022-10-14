package com.puhu.spring.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.puhu.spring.domain.MemberDTO;
import com.puhu.spring.domain.ReportDTO;

import lombok.extern.log4j.Log4j;


@Controller
@Log4j
public class PageController {
	
	//PathVariable 파라미터 전송
	@RequestMapping(value="happy/{msg}", method = RequestMethod.GET)
	public String happy(@PathVariable String msg, Model m) {
		
		m.addAttribute("msg",msg);
		return"happy";
		
	}
	
	//get전송
	@RequestMapping(value="parameter", method = RequestMethod.GET)
	public String happy(@RequestParam Integer val, Model m) {		
		m.addAttribute("val",val);
		return"param";		
	}
	
	//파라미터 getform전송
	@RequestMapping(value="getform", method = RequestMethod.GET)
	public String get(@RequestParam String name, @RequestParam String password, Model m) {		
		m.addAttribute("name",name);
		m.addAttribute("pw",password);		
		return"param2";		
	}
	//파라미터 postform전송
	@RequestMapping(value="postform", method = RequestMethod.POST)
	public String post(MemberDTO dto, @RequestParam String password, Model m) {		
		System.out.println(dto);
		return"param2";		
	}
	
	
	@RequestMapping(value="fileup", method= RequestMethod.POST)
	public void fileup(ReportDTO dto,HttpServletRequest req) {
		if(dto.getPictureurl().isEmpty()) {System.out.println("업로드 안함");}
		else {
			String filepath = req.getServletContext().getRealPath("/upload");
			filepath += "/"+ UUID.randomUUID()+dto.getPictureurl().getOriginalFilename();
			File file = new File(filepath);
			try {
				dto.getPictureurl().transferTo(file);				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
