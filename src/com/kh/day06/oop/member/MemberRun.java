package com.kh.day06.oop.member;

import java.lang.reflect.Member;
import java.util.Scanner;

public class MemberRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] memArr =new Member[3];
		
		finish :
			while(true) {
				int choice ="";
				switch(choice) {
				case 1 : 
					inputScore(memArr);
					break;
				case 2 :
					printScore(memArr);
					break;
				case 3 : 
					checkPass(memArr);
					break;
				case 4 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				}
			}
		}
	private static void  printMenu (Member [] member) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("소설 종류 ");
		System.out.println();
		System.out.println("1." ); 
		
		
		//소설 종류 
		// 1.판타지
		//2. 무협
		//3.게임
		//
	}
	private static void inputScore  (Member [] member) {
		Scanner sc = new Scanner(System.in);
		
	}
	private static void printScore (Member [] member) {
		
	}
	private static void checkPass (Member [] member) {
	
	}
	
}


