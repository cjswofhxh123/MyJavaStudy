package com.kh.day02.loop.exercise;

public class Exercise_For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int num =0;
		for(int i = 1; i<=10; i++) {
			num += i; //sum = sum +i;
		if(i <=9) {
			//+
			System.out.println(i + "+");
		}else {
			//=
			System.out.println(i);
			}
		}
			System.out.println("="+ num);
			}
		}
	

