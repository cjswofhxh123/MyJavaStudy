package com.kh.day05.OOP;
			//The type Circle collides with a package
public class Circle {
	 public int radius; //원의 반지름
	
	 public String name; //원의 이름
	
	//---- 필드 ------
	public Circle() {//생성자(기본)
		//초기화
		radius = 1;
		name = "아무개";//필드에 값을 넣음-> 객체 초기화
	} //생성자
	
	
	//매개변수가 있는 생성자
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	//------생성자
		
		public double getArea() {
			return 3.14*radius*radius;
		}
			
	}

		
		
	

