package com.kh.day12.sort;

public class Exam_BobbleSort {
	public static void main(String[] args) {
		int [] nums =  {5,7,2,1,4};
		
//		{5,2,7,1,4}
//		{5,2,7,1,4}
//		{5,2,1,4,7}
//		{2,5,1,4,7}
//		{2,1,5,4,7}
		//버블 정렬
		//큰수를 오른쪽으로 보낸다
		//{2,1,4,5,7}
		//{1,2,4,5,7}
		//{1,2,4,5,7}
		
		for(int i= 0; i<nums.length; i++) {
			for(int j = 0; j <(nums.length-1)-i; j++) {
				if(nums[j] > nums[j+1]){
					int temp =nums[j+1];
					nums[j+1] = nums[j];
					nums[j]  = temp;
			}
		}
	}

	for(

	int i:nums)
	{
		System.out.print(i + " ");
	}
}


}
