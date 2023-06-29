package com.kh.day03.array;

public class Exam_Array {

	public static void main(String[] args) {
		int num;
		num = 0;
		// int num =0;
		int nums[];// int [] nums;
		nums = new int[10];// 배열의 할당
		// nums는 배열의 주소이다.
		// []는 연산이고 숫자가 들어가서 1칸씩 이동하는 값을 가져옴.
		nums[0] = 2;// 값 초기화
		System.out.println(nums[0]);
		System.out.println("배열의 크기 :" + nums.length);
		// 배열의 할당후
		// 배열의 인덱스 0
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + "");
		}
	}

}
