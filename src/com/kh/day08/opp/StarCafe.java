package com.kh.day08.opp;

public class StarCafe extends CafeCoppey {
			@Override
			public void makeCoffee(int money) {
				if(money == Menu.STARAMERICANO) {
					System.out.println("아메리카노 준비해드겟습니다.");
				}else if(money == Menu.STAR_LATTE) {
					System.out.println("라떼 준비해드겟습니다.");
				}else {
					System.out.println("금액이 더 필요합니다.");
				}
			}
}
