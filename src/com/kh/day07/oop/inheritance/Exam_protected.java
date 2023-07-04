package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.Point.Point;

class Parent{
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}
		
	}
	
class Child extends Parent{
	private int childMoney;
	public Child() {}
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
		//super.pro = 4;
	}
}

class ShapePoint extends Point{
	private String shape;
	public ShapePoint() {}
		void set() {
			super.pub = 1;
			//super.def = 2;
			super.pro = 3;
			//super.pri =4;
			
		}
	}




public class Exam_protected {
	public static void main(String[] args) {
		
	}
}
