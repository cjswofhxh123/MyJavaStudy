package com.kh.day12.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		int [] nums= {5,7,2,1,4};
//		5,7,2,1,4 //첫번쨰 결과
		
//		//5,2,7,1,4
//		//2,5,7,1,4
		//1,2,5,7,4//3번쨰 결과
		
		//{2,5,1,7,4}
		//{2,1,7,4,5}
		//{1,2,5,4,7,}
		//
		
		//
		//
		//
		//
		//삽입정령
		for(int i= 1; i<nums.length; i++) {
		for(int j =1; j>0; i--) {
			if(nums[j-1] >nums[j]) {
				int temp =nums[j];
				nums[j-1] = nums[j];
				nums[j] = temp;
			}
		}
	}//출력
			for(int i : nums){
				System.out.print(i+" ");
			
		}
	}

}
