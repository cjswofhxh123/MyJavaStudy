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
		int[] lottoNums = new int[6];
		Random rend = new Random();
		//rand.nextlnt(10) ->0부터 9까지
		//1부터 45까지
		//0부터 44까지 => rand.nextInt(45)+1
		int count =1;
		int check =1;
		for(int i =0; i <6; i++) {
			lottoNums[i] = rend.nextInt(45)+1;
			for(int e =0; e>count; e++) {
				if(lottoNums[i] == lottoNums[e]) {
				//다시 뽑아야지!!!
				
				//다시 뽑아야지
				//i--;
				//baeak;
				}
			}
		}
//				count++;
//				check++;
//				if(lottoNums[2]== lottoNums[1]) {
//				//다시 뽑아야지!!!
//				}
//			if(lottoNums[2]== lottoNums[0]) {
//				//다시 뽑아야지!!!
//				}
//			if(lottoNums[2]== lottoNums[0]) {
//				//다시 뽑아야지!!!
//				}
//			if(lottoNums[1]== lottoNums[0]) {
//				//다시 뽑아야지!!!
//				}
//			if(lottoNums[1]== lottoNums[0]) {
//				//다시 뽑아야지!!!
//				}
//			
//		}
			

		//버블정렬
			for(int i =0; i <lottoNums.length-1; i++) {
				for(int j =0; j <(lottoNums.length-1)-i; j++) {
					if(lottoNums[j] > lottoNums[j+1]) {
						int tmp = lottoNums[j];//왼쪽에 있는 값이 지워지기 전에 킵해 놓음
						lottoNums[j] = lottoNums[j+1];//오른쪽에 있늕 놈을 왼쪽에 대입함
						lottoNums[j+1] = tmp;//킵해좋은 것을 오른쪽에 대입함
					}
				}
			}
			
			
//		
//		lottoNums[0] = rend.nextInt(45);
//		lottoNums[1] = rend.nextInt(45);
//		lottoNums[2] = rend.nextInt(45);
//		lottoNums[3] = rend.nextInt(45);
//		lottoNums[4] = rend.nextInt(45);
//		lottoNums[5] = rend.nextInt(45);
//		
		for(int i = 0; i < lottoNums.length; i++) {
			System.out.println(lottoNums[i]+ "");
		}
}

		
		
		
	
//	}
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