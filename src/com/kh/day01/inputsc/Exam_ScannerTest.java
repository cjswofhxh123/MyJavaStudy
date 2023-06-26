package com.kh.day01.inputsc;

import java.io.IOException;
import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String[] args)  
	{
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요:");
		String name = sc.next();
		
//		System.out.println("도시를 입력하세요 :");
		String city =sc.next();
		
//		System.out.println("나이를 입력하세요 :");
		int age =sc.nextInt();
		
//		System.out.println("체중를 입력하세요 :");
		double weight = sc.nextDouble();
		
//		System.out.println("싱글입니까:");
		boolean singleYN = sc.nextBoolean();
		
		System.out.println("이름은 " + name+" ,도시는" + city 
				+ ",나이" + age + ",체중" +weight + ",싱글여부" +singleYN + "입니다.");
		
		
//		System.out.println("이름 :" + name);
//		System.out.println("도시 : " +city);
//		System.out.println("니이 : " + age);
//		System.out.println("체중 :" + weight);
//		System.out.println("싱글여부" + singleYN);

		//System.out.println("가이드 메시지");
		//System.out.println(System.in.read());
	}
}
