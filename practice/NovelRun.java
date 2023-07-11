package com.kh.practice;

import java.util.Scanner;

public class NovelRun {
	public static void main(String[] args) {
		NovelFunction no  = new NovelFunction();
		finish :
			while(true) {
				int choice = no.printMenu();
				switch(choice) {
				case 1 : 
					no.novelRental1();
					break;
				case 2 :
					break;
				case 3 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				default : 
					System.out.println("해당 메뉴는 존재하지 않습니다!");
					break;
				}
			}
	}
	
	
	
	
		
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

