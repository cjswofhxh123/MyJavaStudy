package com.kh.day10.collection.music;

public class Music {
	private String title;
	private String musicName;
	
	public Music() {
		
	}
	public Music(String title,String musicName){
		this.title =title;
		this.musicName = musicName;
	}
	public String getTitle() {
		return title;
	}
	public String getMusicName() {
		return title;
	}
	public void setTitle(String title) {
		this.title =title ;
	}
	public  void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	@Override
	public String toString() {
		return "name :" +this.title +"," 
		+this.musicName + ",";
		
	}
}
