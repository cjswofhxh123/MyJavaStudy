package com.kh.day03.array;

import java.util.Scanner;

public class Exam_Array2 {

	public static void main(String[] args) {

		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고
		// 평균을 구하는 프로그램을 작성하라. (단 배열의 크기는 5이다.)
		int nums[] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();

		}

		// 배열의 저장된 값을 이용하여 평균구하기
		// for, num.length, typeTrans, 누적합

		int sum = 0;
		for (int j = 0; j < nums.length; j++) {
			sum += nums[j];
		}
		System.out.println("평균:" + (double) sum / nums.length);

	}
}
