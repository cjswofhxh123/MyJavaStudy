package com.kh.day08.opp.interfacepkg;

public class Exam_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PhoneInterface phone = new PhoneInterface() {
		//1.Cannot instanticate the type
		// => 인터페이스로 객체 생성 안됨.
		
		PhoneInterface phone = new SamsungPhone();
		//업캐스팅!
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
		
		
	}

}
