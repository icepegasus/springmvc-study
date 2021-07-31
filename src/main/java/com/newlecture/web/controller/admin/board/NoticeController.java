package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice")
public class NoticeController {
	
	
	@RequestMapping("/list")
	public String list() {
		
		return "";
	}
	
	@RequestMapping("/reg")
	@ResponseBody
	public String reg(String title, String content, String category, String[] foods, String food, MultipartFile file) {
		
		long size = file.getSize();
		String fileName =  file.getOriginalFilename();
		System.out.printf("fileName:%s, fileSize:%d\n",fileName, size);
		
		for(String f : foods) {
			System.out.println("checkbox food : "+f);
		}
		
		System.out.println("radio food : "+food);
		
		return String.format("title : %s<br>content : %s<br>category : %s<br>",title,content,category);
	}

	@RequestMapping("/edit")
	public String edit() {
		
		return "";
	}

	@RequestMapping("/del")
	public String del() {
		
		return "";
	}


}
