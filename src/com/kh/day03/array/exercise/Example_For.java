package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Example_For {
	public void exercise1() {
		// 양수 5개를 입력받아 배열에 저장하고 제일 큰수를 출력하는 프로그램을 작성하라.
		int num = 0;
		for (int i = 1; i <= 10; i++) {
			num += i; // sum = sum +i;
			if (i <= 9) {
				// +
				System.out.println(i + "+");
			} else {
				// =
				System.out.println(i);
			}
		}
		System.out.println("=" + num);
	}

	public void exercise2() {
		// 양수 5개를 입력받아 배열에 저장하고 제일 큰수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력");
		int dan = sc.nextInt();

		if (dan >= 1 && dan <= 9) {
			System.out.println(dan + "단");

			for (int i = 1; i < 10; i++) {
				System.out.println("2*" + i + "=" + 2 * i);
			}
		}
	}

	public void ForDouble1() {
		// 구구단
		for (int k = 2; k < 10; k++) {
			System.out.println(k + "단");
			for (int h = 1; h < 10; h++) {
				System.out.print(k + " * " + h + " = " + k * h);
			}
		}
	}

	public void ForDouble2() {
		for (int k = 0; k < 24; k++) {
			for (int h = 0; h < 60; h++) {
				System.out.printf("%2d시 %2d분\n", k, h);
				// %2d시 2자리에
			}
		}
	}

	public void ForDouble3() {
		for (int k = 2; k < 10; k++) {
			for (int h = 2; h < 10; h++) {
				System.out.println(h + "*" + k + "=" + h + "\t");
			}
			System.out.println();
		}
	}

	public void Exercise_If1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
//		System.out.println("학년을 입력하세요(1~4)");
//		int grade =sc.nextInt();
		if (score > 70) {
			System.out.println("합격입니다");
		} else if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

	}
}
