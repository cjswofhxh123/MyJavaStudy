package com.kh.day08.opp;

public class Person {
	String name;//이름
	int money;//돈
	//String coppey;//커피
	
	public Person() {
		
	};
	public Person(String name,int money) {
		this.name = name;
		this.money = money;
		//this.coppey = coppey;

}
	public void buyCoffe(CafeCoppey caffe,int money) {
		//돈을 가지고 커피가 나와야 함.
		//caffe.makeCoffee(money);
		this.money -=money;
		caffe.makeCoffee(money);
		
	}
	public void printInfo() {
		System.out.println(this.name + "님의 잔액은 " + this.money +"원입니다.");
	}
}
