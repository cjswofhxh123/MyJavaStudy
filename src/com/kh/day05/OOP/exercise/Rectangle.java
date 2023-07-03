package com.kh.day05.OOP.exercise;

public class Rectangle {
//너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그래을 작성하라.
	//너비와 높이 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진
	//Rectangle 클래스를 만들어라.
	//--------------------필드
	//--------------------생성자
	//---------------------
	public int width;
	public int height;
	
	public Rectangle() {
		
	}
	//반환형은 없다.
	//생성자는 클래스이름과동일
	//맴버변수에 값을 넣어주는 것
	//기본생성자는 생략이 됨
	public int getArea() { // 원의 면적 계산 메소드
		return width*height;
		}
	
	
	
	
	
}
