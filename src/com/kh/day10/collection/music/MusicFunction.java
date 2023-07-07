package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicFunction {
	
		List<Music> mList;
	
	public MusicFunction() {
		mList = new ArrayList<Music>();
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----메인 메뉴--------");
		System.out.println("1.마지막 위치에 곡 추가");
		System.out.println("2.첫 위치에 곡 추가");
		System.out.println("3.전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9.가수명 오름차순 정렬");
		System.out.println("10.가수명 내림차순 정렬");
		System.out.println("0. 종료");
		int choice =sc.nextInt();
		return choice;
}
		//1번 
		public void inputMusicInfo() {
			Scanner sc = new Scanner(System.in);
			System.out.println("곡명 :");
			String title = sc.next();
			System.out.println("가수명 :");
			String musicName = sc.nextLine();
			Music music  = new Music(title,musicName);
			mList.add(music);
		}
	
	
		//2번
		public void inputMusicAtFirst() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("곡명 :");
			String title = sc.next();
			System.out.println("가수명 :");
			String musicName = sc.nextLine();
			Music music  = new Music(title,musicName);
			mList.add(0,music);
		}
		//3번
		public void printAllMusics() {
			System.out.println("전체 곡 목록 출력");
			for(int i = 0; i< mList.size(); i++) {
				Music music = mList.get(i);
				System.out.printf("%d번쨰 노래->곡명 :%s, 가수명:%s",
						(i+1)
						,music.getTitle()
						,music.getMusicName());
			}
		}
		//4번
		public void printOneByTitle() {
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 이름 :");
			String title = sc.next();
			for(Music music : mList) {
				if(music.getTitle().equals(title)) {
					System.out.printf("검색결과>> 곡명 :%s, 가수명: $s"
							, music.getTitle()
							, music.getMusicName());
					break;
				}
			}
		}
		//5.곡명으로 음악 삭제하기
		public void removeMusicByTitle() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("삭제할 곡 입력 :");
			String title = sc.next();
			for(int i =0; i <mList.size(); i++) {
			Music music = mList.get(i);
				if(music.getTitle().equals(title)) {
					//mList에서 삭제
					mList.remove(i);
				}
					break;//삭제햇으면 멈춰
				}
		}
		
		//6번 수정하기
		public void modifyMusicInfo() {
			Scanner sc = new Scanner(System.in);
			System.out.print("수정할 곡 입력 :");
			String title = sc.next();
			System.out.print("수정할 정보 입력(곡명) :");
			String modTitle = sc.nextLine();
			System.out.print("수정할 정보 입력(가수명) :");
			String modMusicName = sc.nextLine();
			Music modMusic = new Music(modTitle,modMusicName);
			for(int i =0; i <mList.size(); i++) {
			Music music = mList.get(i);
				if(music.getTitle().equals(title)) {
					//mList에서 삭제
					mList.set(i, modMusic);
		}
			}
}
		}
		
