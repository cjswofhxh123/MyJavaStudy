package com.kh.day04.dimarray.exericise;

public class Exercise_DimArray {

	public void exercise() {

		int[][] arrs = new int[5][5];
		int k = 1;
		for (int i = 4; i < arrs.length; i++) {
			for (int j = arrs.length - 1; j >= 0; j--) {
				arrs[0][4] = k;
				k++;
			}
		}
		// 출력
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}
	}
//		arrs[0][4]= 1;
//		arrs[0][3]= 2;
//		arrs[0][2]= 3;
//		arrs[0][1]= 4;
//		arrs[0][0]= 5;                                      
//		
//		arrs[1][4]= 6;
//		arrs[1][3]= 7;
//		arrs[1][2]= 8;
//		arrs[1][1]= 9;
//		arrs[1][0]= 10;
//		
//		arrs[2][4]= 11;
//		arrs[2][3]= 12;
//		arrs[2][2]= 13;
//		arrs[2][1]= 14;
//		arrs[2][0]= 15;
//		

//		nums[0][0] = 1; 
//		nums[0][1] = 2; 
//		nums[0][2] = 3; 
//		nums[0][3] = 4; 
//		nums[0][4] = 5;
//		
//		nums[1][0] = 6; 
//		nums[1][1] = 7; 
//		nums[1][2] = 8; 
//		nums[1][3] = 9; 
//		nums[1][4] = 10; 
//		
//		System.out.print(nums[0][0]+"");
//		System.out.print(nums[0][1]+"");
//		System.out.print(nums[0][2]+"");
//		System.out.print(nums[0][3]+"");
//		System.out.print(nums[0][4]+"");
//		System.out.println();
//		System.out.print(nums[1][4]+"");
//		System.out.print(nums[1][3]+"");
//		System.out.print(nums[1][2]+"");
//		System.out.print(nums[1][1]+"");
//		System.out.print(nums[1][0]+"");

	public void exercise2() {
		int[][] arrs = new int[5][5];
		int k = 1;
		for (int j = 0; j < arrs.length; j++) {
			for (int h = arrs.length; h <= 0; h--) {
				arrs[h][j] = k;
				k++;
			}
		}
//		
//		arrs[4][0] = 1;
//		arrs[3][0] = 2;
//		arrs[2][0] = 3;
//		arrs[1][0] = 4;
//		arrs[0][0] = 5;

		// 출력
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}
	}
		 
	public void exercise3() {
		int[][] arrs = new int[5][5];
		int k = 1;

		for (int h = 0; h < 5; h++) {
			for (int s = 0; s < arrs.length; s++) {
				arrs[s][h] = k;
				k++;
			}
		}

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise4() {
		int[][] arrs = new int[5][5];
		int k = 1;

		for (int s = 0; s < 5; s++) {
			if (s % 2 == 0) {
				for (int m = 0; m < 5; m++) {
					arrs[s][m] = k;
					k++;
				}
			} else {
				for (int m = 4; m >= 0; m--) {
					arrs[s][m] = k;
					k++;
				}
			}

		}

		arrs[0][0] =1;
		arrs[0][1] =2;
		arrs[0][2] =3;
		arrs[0][3] =4;
		arrs[0][4] =5;
		
		arrs[2][0] =6;
		arrs[2][1] =7;
		arrs[2][2] =8;
		arrs[2][3] =9;
		arrs[2][4] =10;	

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		// (3,3,3,4) , (3,5,3,6), (3,7,4,0), (4,1,4,2)
		double[][] score = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
//		score[0][0] = 3.3;
//		score[0][1] = 3.4;
//		
//		score[1][2] = 3.5;
//		score[1][3] = 3.6;
//		
//		score[2][0] = 3.7;
//		score[2][1] = 3.8;
//		
//		score[3][0] = 4.1;
//		score[3][1] = 4.2;

		double sum = 0;
		for (int k = 0; k < score.length; k++) {
			for (int h = 0; h < score[k].length; h++) {
//				System.out.printf("%.1f",score[k][h]);
				sum += score[k][h];
			}
//			System.out.println();
		}
		int frontLength = score.length;
		int backLength = score.length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 평점 평균은 : %.2f\n", result);

	}

	
	public void ex3() {
		int [][] arr = new int[5][5];
		arr[0][0] =5;
		arr[0][1]= 4;
		arr[0][2]= 3;
		arr[0][3]= 2;
		arr[0][4]= 1;
		
		arr[0][0] =5;
		arr[0][1]= 4;
		arr[0][2]= 3;
		arr[0][3]= 2;
		arr[0][4]= 1;

		arr[0][0] =5;
		arr[0][1]= 4;
		arr[0][2]= 3;
		arr[0][3]= 2;
		arr[0][4]= 1;

		

	}
	
}
