package com.kh.day10.collection.music;

import java.util.Scanner;


public class MusicRun {
	public static void main(String[] args) {
		
		MusicFunction MFunc = new MusicFunction();
		end:
		while (true) {
			int value = MFunc.printMenu();
		switch (value) {
		case 1:
			MFunc.inputMusicInfo();
			break;
		case 2:
			MFunc.inputMusicAtFirst();
			//MFunc.searchInfoByName();
			break;
		case 3:
			MFunc.printAllMusics();
			break;
		case 4:
			MFunc.printOneByTitle();
			break;
		case 5:
			MFunc.removeMusicByTitle();
			break;
		case 6:
			MFunc.modifyMusicInfo();
			break;
		default:
			break;
		}
	}
	}
}
