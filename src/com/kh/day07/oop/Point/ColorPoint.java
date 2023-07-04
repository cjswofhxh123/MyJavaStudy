package com.kh.day07.oop.Point;

public class ColorPoint extends Point {
	private String color;
	
	
	
	public ColorPoint() {
		super();
	}
	public ColorPoint(int x,int y,String color) {
		//this.x =x;
		//this.y= y;
//		super.x =x;
//		super.y =y;
		super(x,y);
		this.color =color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		super.showPoint();
	}
	
}
