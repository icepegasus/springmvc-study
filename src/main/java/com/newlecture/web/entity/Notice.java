package com.newlecture.web.entity;

import java.util.Date;

public class Notice {
	
	private int id;
	private String title;
	private String writerId;
	private Date regDate;
	private String Content;
	private int hit;
	private String files;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Notice(int id, String title, String writerId, Date regDate, String content, int hit, String files) {
		this.id = id;
		this.title = title;
		this.writerId = writerId;
		this.regDate = regDate;
		Content = content;
		this.hit = hit;
		this.files = files;
	}
	
	


	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", writerId=" + writerId + ", regDate=" + regDate
				+ ", Content=" + Content + ", hit=" + hit + ", files=" + files + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}
	
	

}
