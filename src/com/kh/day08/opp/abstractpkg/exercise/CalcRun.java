package com.kh.day08.opp.abstractpkg.exercise;

public class CalcRun {
	public static void main(String[] args) {
		//Calculator calc = new Calculator();
		Calculator calc =new GoodCalc();//업캐스팅
		//추상클래스는 객체 생성 안됨//
		//Cannot instantiate the type Calculator
		int [] a= {11,25,30,43,54};
			System.out.printf("합 :%d\n", calc.add(1, 2));
			System.out.printf("평균 :%2f", calc.average(a));
	}
}
