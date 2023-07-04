package com.kh.day06.oop.objectarray;

public class ExamObjectArray {
	public static void main(String[] args) {
//		Circle c = new Circle();
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);
		Circle [] cArray;
		cArray = new Circle[5];
		Circle  c= cArray[0];
		System.out.println(c);
		cArray[0] = new Circle();
		System.out.println(cArray[0]);
		cArray[0].radius = 10;
		
		
		for(int i = 0; i <cArray.length; i++) {
			cArray[i] = new Circle(); //이때 화살표가 생기는 거임 .
		}
		cArray[0].radius = 1;
		cArray[1].radius = 2;
		cArray[2].radius = 3;
		cArray[3].radius = 4;

		System.out.println(cArray[0].getArea());
		System.out.println(cArray[1].getArea());
		System.out.println(cArray[2].getArea());
		System.out.println(cArray[3].getArea());
		
		
		

	}
}
