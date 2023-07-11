package com.kh.practice;

import java.util.Date;

public class Novel {
	
	String bookName;
	String bookAuthor;
	String bookgenre;
	Date 대출날짜;
	Date 반납날짜;
	
	
	public Novel() {}
	
	public Novel(String bookName,String bookAuthor,String bookgenre) {
		this.bookName = bookName;
		String name;//빌리는 사람
		
	}
	public String getbookName() {
		return this.bookName;
	}
	
	public void setbookName(String bookName) {
		this.bookName = bookName;
	}
}
