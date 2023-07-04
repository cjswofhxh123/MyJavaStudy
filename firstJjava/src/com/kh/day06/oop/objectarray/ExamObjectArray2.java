package com.kh.day06.oop.objectarray;

import java.util.Scanner;

import com.kh.day05.OOP.Book;

public class ExamObjectArray2 {
	public static void main(String[] args) {
	//실제값을 저장하는 기본형 
	book [] books  =new book[2];
	Scanner sc = new Scanner(System.in);
	
	
	for(int i = 0; i <books.length; i++) {
	System.out.println("제목 >>");
		String title = sc.nextLine();
	System.out.println("저자");
		String author = sc.nextLine();
		books[i] =new book(title, author);
		books[i].title = title;
		books[i].author= author;
		System.out.println("(" + books[i].title + "," +books[i].author + ")");
	}
		
		
		
//		System.out.println("제목 >>");
//		title = sc.nextLine();
//		System.out.println("저자");
//		author = sc.nextLine();
//		books[1] =new book(title, author);
////		books[0].title = title;
////		books[0].author= author;
//		
//		System.out.println("(" + books[1].title + "," +books[1].author + ")");
	}
}
