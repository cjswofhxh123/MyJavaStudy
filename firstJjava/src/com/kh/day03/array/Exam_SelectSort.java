package com.kh.day03.array;

import java.util.Scanner;

public class Exam_SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택정렬이란?
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬 알고리즘
		// 특징 : 데이터의 양이 적을때 좋은 성능을 보여주는 정렬이지만
		// 데이터 양이 많을때 급격한 성능 저하를 보임.
		// 배열의 n번 인덱스값을 n-1번 ~ 마직막 인덱스까지 비교함.
		// {2,5,4,1,3}
		// 첫번째 :{1,5,4,2,3}
		// {1,5,4,2,3}
		// 두번째 :{ 1,2,4,5,3}
		// {1,2,4,5,3}
		// 세번째 : {1,2,3,5,4}
		// {1,2,3,5,4}
		// 네번째 {1,2,3,4,5}

		// 1.최소값의 값을 구하는 방법으로
		// 2. 배열의 값을 교환.
		// 3. min값은 최소값이 아니라 인덱스값을 저장해야함.
		// 4. 최소값을 찾는 범위가 시작은 1이 되고 점점 증가해야했었고
		// 바꿔야 하는 자리는 0부터 시작해서 1씩 증가해야했음.
		// 5. 만족하는 변수를 선언하여 1씩 증가하는 for문을 작성후 코드를 이동
//		int[] arrs = { 2, 5, 4, 1, 3 };
//		int min = 0; // min은 최소값 저장하면 안되고 최소인 인덱스값을 저장해야함.oo
//		for (int i = 0; i < arrs.length - 1; i++) {
//			min = i;
//			for (int j = i + 1; j < arrs.length; j++) {
//				if (arrs[min] > arrs[j]) {
//					min = j;
//				}
//			}
//			int temp = arrs[i];
//			arrs[i] = arrs[min];
//			arrs[min] = temp;
//		}
//		for (int i = 0; i < arrs.length; i++) {
//			System.out.println(arrs[i] + "");
//		}

		// {2,5,4,1,3}
		// j=1,min = 0;
		// 첫번째 :{1,5,4,2,3}
		// {1,5,4,2,3}
		// j=2,min =1;
		// 두번째 :{ 1,2,4,5,3}
		// {1,2,4,5,3}
		// 세번째 : {1,2,3,5,4}
		// {1,2,3,5,4}
		// 네번째 {1,2,3,4,5}

	}
	public void practice1() {
		int num[] = new int[10];
		int min = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i< num.length; i++) {
				min += i;

				num[i] = sc.nextInt();
				
				System.out.println(num[i] + "");
		}
	}
//	public void practice4() {
//		String grace[] = new String[5];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 1; i< grace.length; i++) {
//			  grace += i;
//	}
}
