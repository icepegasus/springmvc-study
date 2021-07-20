package com.newlecture.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.newlecture.web.entity.Notice;

public class NoticeService {
	
	public List<Notice> getList(int page, String field, String query){
		
		List<Notice> noticeList = new ArrayList<>();
		
		Notice notice1 = new Notice(1, "����1", "ccw", new Date(), "���ðԽñ��Դϴ�.", 1, "");
		Notice notice2 = new Notice(2, "����2", "kmj", new Date(), "�����Խñ��Դϴ�.", 5, "");
		
		
		noticeList.add(notice1);
		noticeList.add(notice2);
		
		return noticeList;
		
	}

}
