package com.kh.day11.iostream.fileio;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) {
		
		
		
		
		File file = new File("E:\\capture.PNG");
		String fileName = file.getName();
		String path = file.getPath();
		String parent  = file.getParent();
		System.out.printf("파일 이름:%s\n 파일경로 : %s\n부모 폴더 :%s\n"
				,fileName
				,path
				,parent
				);
	
	System.out.printf("파일이 존재하는가? : %b\n파일이 맞는가? : %b\n 폴더가 맞는가 ? :%d\n"
			,file.exists()
			,file.isFile()
			,file.isDirectory());
	}	

		
		public void folderMake() {
			File folderMake = new File("") ;
			folderMake.mkdir();
			System.out.println("폴더가 만들어 졋습니다.");
			
		}
		public void fileMake() {

		File fileMake = new File("src/com/kh/day11/iostream/fileio/file1.txt");
		try {
			fileMake.createNewFile();
			System.out.println("파일이 만들어졋습니다.");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
