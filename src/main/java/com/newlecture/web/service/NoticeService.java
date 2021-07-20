package com.newlecture.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.newlecture.web.entity.Notice;

public class NoticeService {
	
	public List<Notice> getList(int page, String field, String query){
		
		List<Notice> noticeList = new ArrayList<>();
		
		Notice notice1 = new Notice(1, "제목1", "ccw", new Date(), "오늘게시글입니다.", 1, "");
		Notice notice2 = new Notice(2, "제목2", "kmj", new Date(), "어제게시글입니다.", 5, "");
		
		
		noticeList.add(notice1);
		noticeList.add(notice2);
		
		return noticeList;
		
	}

}
