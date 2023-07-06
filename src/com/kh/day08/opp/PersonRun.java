package com.kh.day08.opp;

public class PersonRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ps  = new Person("김씨",10000);
		ps.buyCoffe(new CafeCoppey(), 4000);
		Person lee = new Person("이씨",20000);
		lee.buyCoffe(new CongCafe(), 4500);
		ps.printInfo();
	}

}
