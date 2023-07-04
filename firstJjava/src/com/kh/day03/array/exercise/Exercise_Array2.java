package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_Array2 {

	public static void main(String[] args) {

		// 양수 5개를 입력받아 배열에 저장하고 제일 큰수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		int[] nums = new int[5];
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] > max) {
				max = nums[i];// 현재 max보다 입력한 값보다 크면
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
//		nums[1] = sc.nextInt();
//		nums[2] = sc.nextInt();
//		nums[3] = sc.nextInt();
//		nums[4] = sc.nextInt();
//		nums[5] = sc.nextInt();

	}

}
