package com.newlecture.web.service.jdbc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

public class JDBCNoticeService implements NoticeService{
	

	
	//private String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	//private String uid = "NEWLEC";
	//private String pwd = "11111";
	//private String driver = "oracle.jdbc.driver.OracleDriver";
	
	
	
	public List<Notice> getList(int page, String field, String query){
		
		List<Notice> noticeList = new ArrayList<>();
		
		Notice notice1 = new Notice(1, "����1", "ccw", new Date(), "���ðԽñ��Դϴ�.", 1, "");
		Notice notice2 = new Notice(2, "����2", "kmj", new Date(), "�����Խñ��Դϴ�.", 5, "");
		
		
		noticeList.add(notice1);
		noticeList.add(notice2);
		
		return noticeList;
		
	}

}
