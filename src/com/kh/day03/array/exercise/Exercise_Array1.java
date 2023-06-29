package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
//	public void exercise1() {
//		// 양수 5개를 입력받아 배열에 저장하고 제일 큰수를 출력하는 프로그램을 작성하라.
//		Scanner sc = new Scanner(System.in);
//		// int num = sc.nextInt();
//		int[] nums = new int[5];
//		int max = 0;
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = sc.nextInt();
//			if (nums[i] > max) {
//				max = nums[i];// 현재 max보다 입력한 값보다 크면
//			}
//		}
//		System.out.println("가장 큰 수는 " + max + "입니다.");
////		nums[1] = sc.nextInt();
////		nums[2] = sc.nextInt();
////		nums[3] = sc.nextInt();
////		nums[4] = sc.nextInt();
////		nums[5] = sc.nextInt();
//
//	}
//
//	public void exercise2() {
//		// 양수 5개를 입력받아 배열에 저장하고 제일 큰수를 출력하는 프로그램을 작성하라.
//		Scanner sc = new Scanner(System.in);
//		// int num = sc.nextInt();
//		int[] nums = new int[5];
//		int max = 0;
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = sc.nextInt();
//			if (nums[i] > max) {
//				max = nums[i];// 현재 max보다 입력한 값보다 크면
//			}
//		}
//		System.out.println("가장 큰 수는 " + max + "입니다.");
////				nums[1] = sc.nextInt();
////				nums[2] = sc.nextInt();
////				nums[3] = sc.nextInt();
////				nums[4] = sc.nextInt();
////				nums[5] = sc.nextInt();
//	}

	public void arryCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 230515-1231514 -> 230515-1*******
		// 231026-1231515 -> 231026-1*******
		char[] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요 : ");
		String memeberNum = sc.next();
		for (int i = 0; i < origin.length; i++) {
			origin[i] = memeberNum.charAt(i);
		}
		char[] copy = new char[14];//깊은 복사의 시작
		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				copy[i] = origin[i];//성별자리전까지 차례대로 값을 대입
			} else {
				copy[i] = '*';//성별자리 이우후엔 *로 값 대입
			}
		}

		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}

	}
	//끝판왕
	public void lottoExercise() {
		//// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
	
	
	}
	public void Baskin_RObbins_31_Game() {
		
		
		Scanner sc =new Scanner(System.in);
		//Random rand = new Random();
		System.out.println("-------가위바위보 게임----------");
		System.out.println("숫자를 선택하세요 1.가위2.바위3.보 :");
		String myturn = sc.next();
		String scissors =sc.next();
		
		switch (scissors ) {
		case "1번":
			System.out.println("당신은 가위를 냈습니다.");
			break;
		case "2번":
			System.out.println("당신은 바위를 냈씁니다.");
			break;
		case "3번":
			System.out.println("당신은 보를 냈습니다.");
			break;
			
		}
	}
}