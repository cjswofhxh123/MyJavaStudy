package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.model.vo.Music;

public class MusicController {
	List<Music> mList;

	public MusicController() {
		mList = new ArrayList<Music>();
	}

	/*
	 * 마지막 위치에 곡 추가
	 * 
	 * @param music
	 * 
	 * 
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}
	public void addAtZero(Music music) {
		mList.add(music);
	}
	
	public void updateMusic(int index,Music music) {
		mList.set(index, music);
	}
	
	public void removeMusic(int i) {
		mList.remove(i);
	}

	public List<Music> printMusicList() {
		return mList;
	}


	public List<Music> searchMusicByName(String title) {
		// 찾은 음악을 담을 리스트
		List<Music> findList = new ArrayList<Music>();
		// 기존 음악이 있는 mList에서 찾기
		for (Music mOne : mList) {
			// 입력한 이름이 같으면
			if (mOne.getTitle().equals(title)) {
				// findList에 추가하기
				findList.add(mOne);
			}
		}
		return findList;
	}

	public int searchOneByTitle(String title) {
		for (int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if (music.getTitle().equals(title)) {
				return i;
				// mList에서 삭제

			}
		}
		return -1;
	}

		// 삭제햇으면 그만와라 

	public void bubbleSortByTitleASC() {
		// 버블정렬
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < (mList.size() - 1) - i; j++) {
				Music mOne = mList.get(i);
				Music mTwo = mList.get(j + 1);
				// The operator > is undefined for the argument
				// type(s) java.lang.String, java.lang.String
				// 결과값이 0이면 도일함
				// 양수값이면 외쪽이 순서가 더 큼
				// 음수값이면 외쪽이 순서가 작음
				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j, mOne);
					mList.set(j + 1, temp);
				}
			}
		}
	}

	public void bubbleSortByTitleDESC() {
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < (mList.size() - 1) - i; j++) {
				Music mOne = mList.get(i);
				Music mTwo = mList.get(j + 1);
				// The operator > is undefined for the argument
				// type(s) java.lang.String, java.lang.String
				// 결과값이 0이면 도일함
				// 양수값이면 외쪽이 순서가 더 큼
				// 음수값이면 외쪽이 순서가 작음
				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j, mOne);
					mList.set(j + 1, temp);
				}
			}
		}
	}

	public void bubbleSortBySingerASC() {
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < (mList.size() - 1) - i; j++) {
				Music mOne = mList.get(i);
				Music mTwo = mList.get(j + 1);
				// The operator > is undefined for the argument
				// type(s) java.lang.String, java.lang.String
				// 결과값이 0이면 도일함
				// 양수값이면 외쪽이 순서가 더 큼
				// 음수값이면 외쪽이 순서가 작음
				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j, mOne);
					mList.set(j + 1, temp);
				}
			}
		}

	}

	public void bubbleSortBySingerDESC() {
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < (mList.size() - 1) - i; j++) {
				Music mOne = mList.get(i);
				Music mTwo = mList.get(j + 1);
				// The operator > is undefined for the argument
				// type(s) java.lang.String, java.lang.String
				// 결과값이 0이면 도일함
				// 양수값이면 외쪽이 순서가 더 큼
				// 음수값이면 외쪽이 순서가 작음
				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j, mOne);
					mList.set(j + 1, temp);
				}
			}
		}
	}
}
