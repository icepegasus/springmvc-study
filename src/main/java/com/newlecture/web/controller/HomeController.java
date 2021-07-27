package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	@ResponseBody
	public String index() {
		 
		return "Hello index 1";
	}
	
	@RequestMapping("/help")
	public void help() {
		
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		System.out.println("index controller");
//		
//		ModelAndView mv = new ModelAndView("root.index");
//		
//		mv.addObject("data", "Hello Spring MVC~");
//		
//		return mv;
//	}

}
