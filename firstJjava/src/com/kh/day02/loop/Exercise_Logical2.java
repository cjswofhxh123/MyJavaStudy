package com.kh.day02.loop;

import java.util.Scanner;

public class Exercise_Logical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요: ");
//		String words = sc.next();
//		//문자열에서 첫번째 인덱스를 자르니까 문자가 됨
//		System.out.println("문자열 확인 : " + words);
		char word = sc.next().charAt(0);
		System.out.println("문자 출력 : " + word);
		boolean result = (word > 'A') && (word <= 90);
		System.out.println("영어 대문자 확인 : " + result);
	}
}
