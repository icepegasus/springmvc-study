package com.newlecture.web.controller.admin.board;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice")
public class NoticeController {
	
	@Autowired
	private ServletContext ctx;
	
	
	@RequestMapping("/list")
	public String list() {
		
		return "";
	}
	
	@RequestMapping("/reg")
	@ResponseBody
	public String reg(String title, String content, String category, String[] foods, String food, MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException{
		
		long size = file.getSize();
		String fileName =  file.getOriginalFilename();
		System.out.printf("fileName:%s, fileSize:%d\n",fileName, size);
		
		//ServletContext ctx = request.getServletContext();
		 
		String webPath = "/static/upload";
		String realPath = ctx.getRealPath(webPath);
		System.out.printf("realPath : %s\n", realPath);
		
		//업로드 경로가 없을경우 디렉토리 생성
		File savePath = new File(realPath);
		if(!savePath.exists()) {
			savePath.mkdirs();
		}
		
		realPath += File.separator + fileName;
		
		System.out.printf("last realPath : %s\n", realPath);
		
		File saveFile = new File(realPath);
		file.transferTo(saveFile);
		
		
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
