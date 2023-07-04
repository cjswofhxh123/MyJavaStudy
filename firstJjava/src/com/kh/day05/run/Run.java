package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.OOP.Book;
import com.kh.day05.OOP.Circle;
import com.kh.day05.OOP.exercise.Rectangle;

public class Run {

	public static void main(String[] args) {
		
//		Book littlePrince = new Book();
//		littlePrince.title = "어린왕자";
//		littlePrince.author = "생택쥐페리";
		Book littlePrince
		=new Book("어린왕자","생택쥐페리");
		Book loveStory
		=new Book("춘향전");
		
		System.out.println(littlePrince.title+","+littlePrince.author);
		System.out.println(loveStory.title + ","+ loveStory.author);
		
		
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("너비를 입력해주세요:");
		rect.width =sc.nextInt();
		System.out.println("높이를 입력해주세요");
		rect.height = sc.nextInt();
		int result = rect.getArea();
		System.out.println("해당 사각형의 넒이는 "+ result+"입니다.");
		
		
		Circle pizza;
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
		pizza = new Circle(10,"청년피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

//		Circle dount = new Circle();
//		dount.radius = 2;
//		dount.name = "청년도넛";
		Circle dount = new Circle(2,"청년도넛");
		area = dount.getArea();
		System.out.printf("%s의 면적은 %.2f", dount.name, area);
		
		

	}
}
//		Circle circle = new Circle();
//		Circle circle2 = new Circle();
//		Circle circle3 = new Circle();
//		Circle circle4 = new Circle();
//		
//		circle.radius = 1;
//		circle2.radius = 2;
//		circle3.radius = 3;
//
//		System.out.println(circle.getArea()); 
//		System.out.println(circle2.getArea()); 
//		System.out.println(circle3.getArea()); 
