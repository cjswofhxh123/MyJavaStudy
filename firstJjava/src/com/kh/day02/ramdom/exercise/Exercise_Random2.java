package com.kh.day02.ramdom.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand =new Random();
		System.out.println("-----동전 앞면 뒷면 맟추기--------");
		while (true) {
			System.out.println("숫자를 입력해주세요");
			int choice =sc.nextInt();
			if(choice < 0 || choice >3) {
				System.out.println("1 또는 3를 입력해주세요 (1번./2번/3번) :");
				choice = sc.nextInt();
				if(choice == 1 || choice ==2 || choice ==3) {
					break;
				}else {
					System.out.println("(1번./2번/3번)을 입력해주세요");
				}
				}
			int computer = rand.nextInt(3) + 1;	
			
//			switch(choice == computer) {
//			case "1번":
//				System.out.println("당신을 가위를 냈습니다.");
//				break;
//			case "2번":
//				System.out.println("당신을 가위를 냈습니다.");
//				break;
//			case "3번":
//				System.out.println("당신을 가위를 냈습니다.");
//				break;
//			}else {
//				System.out.println("틀렸습니다.");
//			}
//				
//			}
			
//			
//	}
//}
		}
	}
}
		