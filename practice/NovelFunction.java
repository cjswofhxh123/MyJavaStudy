package com.kh.practice;

import java.util.Scanner;

import com.kh.day10.collection.student.Student;

public class NovelFunction {

	
	
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("소설 대여 프로그램");
		System.out.println("1. 소설 대여하기");
		System.out.println("2. 출판사 어디");
		System.out.println("3. 글쓴이 누구");
		System.out.println("5. 소설 반납하기");
		System.out.println("6. 프로그램 종료하기 ");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	public int novelRental1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("소설1을 대여하시겟습니까. ");
		System.out.print("소설이름:");
		String bookName = sc.next();
		System.out.println("소설을 대여하엿습니다.");
		return printMenu();

		
	}
	public int novelRental2() {
		public void searchInfoByName() {
			System.out.println("학생 정보 이름 검색");
			Scanner sc = new Scanner(System.in);
			System.out.println("검색할 이름 :");
			String bookName = sc.next();
				break;
			}
		//String 
	}

//	public int Novelrental() {
//		
//	}
	
	
	//----------소설 대여 프로그램---------------- 
	//1번 : 소설대여하기
	//2번 : 종료하기
//		-------------------------
//		1번 : 소설1, 
//		2번 : 소설2, 
//		3번 : 소설3, 
//		4번 : 소설4
//		print("소설1을 선택하셧습니다.");
//		print("소설1을 대여하시겟습니까?”);
//		1번: 대여하기 
//		print("소설1을 대여햇습니다.”);
//		----------소설 대여 프로그램---------------- 
//		1번 : 소설대여하기
//		2번 : 종료하기
//		----------소설 대여 프로그램---------------- 
//		종료하시겟습니까?
	
}
