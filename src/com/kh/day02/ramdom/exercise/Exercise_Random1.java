package com.kh.day02.ramdom.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동전 앞뒤 맞추기!!
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		틀렸습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		틀렸습니다.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("====== 동전 앞 뒤 맞추기 =======");
		while(true) {
			System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
		int choice = sc.nextInt();
		if(choice < 0 || choice > 2) {
			System.out.println("1 또는 2 를 입력해주세요.");
			while(true) {
				System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
				choice = sc.nextInt();
				if(choice == 1 || choice == 2) {
					break;
				}else {
					System.out.println("1 또는 2 를 입력해주세요.");
				}
			}
					//두번째 방법
////						do {
////							System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
////							choice = sc.nextInt();					
////						}while(choice < 0 || choice > 2);
		          

		}
		int computer = rand.nextInt(2) + 1;
		// 1 부터 2까지의 랜덤한 수
		// 0 부터 1까지의 랜덤 -> nextInt(2)
		// 1 부터 2까지의 랜덤 -> nextInt(2) + 1

		if(choice == computer) {
			System.out.println("맞췄습니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
		}
	}
}
		
		
		
		
////		Scanner sc = new Scanner(System.in);
////		System.out.println("숫자를 입력해주세요(1.앞면/ 2.뒷면):");
////		int computer = sc.nextInt();
////		int choice = sc.nextInt();
////		switch (choice == computer) {
////		case "1":
////			System.out.println("맟췄습니다.");
////			break;
////		case  "카푸치노":
////			System.out.println("3500입니다.");
////		case  "카페라떼":
////			System.out.println("3500입니다.");
////			break;
////		case "아메리카노": //price = 3500; 
////			//System.out.println("3500입니다.");
////		break;
//////		
//	}
//	}
//}



