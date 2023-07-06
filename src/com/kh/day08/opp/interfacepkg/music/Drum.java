package com.kh.day08.opp.interfacepkg.music;

public class Drum implements Instrument{
	@Override
	public void tunning() {
		System.out.println("zzzzzzzzzz ddddddddddddgggggg");
	}
	@Override
	public void playInstruument() {
		System.out.println("도레미파솔라시");
	}
}
