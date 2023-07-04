package com.kh.day06.oop.student;

import java.awt.print.PrinterException;
import java.util.Scanner;

import com.kh.day06.oop.exercise.Student;

public class StudentRun2 {
	public static void main(String[] args) {
	
		Student [] stdArr =new Student[3];
		while(true) {
			int choice = printMenu();
			switch (choice) {
			case 1:
				inputScore(stdArr);
				break;
			case 2:
				printScore(stdArr);
				break;
			case 3:
				checkPass();
				break;
			case 4:
				System.out.println("프로그램이 종료되었습니다.");
	
				break;
			}
		}
		
		
	public static void printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 학생성적 확인 프로그램 =======");
		System.out.println("====== 1.학생 성적 입력 =======");
		System.out.println("====== 2.학생 성적 출력 =======");
		System.out.println("====== 3.재평가 여부 확인 =======");
		System.out.println("====== 4.프로그램 종료 =======");
	}
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		Student stdArr = new Student();
		//printMenu();
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("======1번쨰 학생 정보 입력 =======");
			String name =sc.next();
			System.out.println("======1차 점수 입력: =======");
			int firstScors =sc.nextInt();
			System.out.println("======2차 점수 입력: =======");
			int SecondScore =sc.nextInt();
			stdArr[i] =new Student();
			stdArr[i].name = name;
			stdArr[i] .firstScors = firstScors;
			stdArr[i] .SecondScore = SecondScore;

			break;
		case 2:
			for(int i = 0; i< ; i++) {
			System.out.println("1번째 학생 정보 출력");
			System.out.println(stdArr.[0].name +"학생의 저수는 1차 점수:");
			}
			break;
		case 3:
			showGoodBye();
		case 4:
			System.out.println();
			break finish;
			default :PrinterException();
			
		
		}

	}
	
	
	
	public static void printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("====== 학생성적 확인 프로그램 =======");
		System.out.println("====== 1.학생 성적 입력 =======");
		System.out.println("====== 2.학생 성적 출력 =======");
		System.out.println("====== 3.재평가 여부 확인 =======");
		System.out.println("====== 4.프로그램 종료 =======");
		int choice = sc.nextInt();
		return choice;
	}
	}
	public static void inputScore() {
		for(int i = 0; i < stdArr.lengthl; i++) {
		System.out.println("======1번쨰 학생 정보 입력 =======");
		String name =sc.next();
		System.out.println("======1차 점수 입력: =======");
		int firstScors =sc.nextInt();
		System.out.println("======2차 점수 입력: =======");
		int SecondScore =sc.nextInt();
		stdArr[i] =new Student();
		stdArr[i].name = name;
		stdArr[i] .firstScors = firstScors;
		stdArr[i] .SecondScore = SecondScore;
	}
	public static void checkPass() {
		System.out.println("나옴.");
	}
}

	
