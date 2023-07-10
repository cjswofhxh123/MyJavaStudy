package com.kh.day11.iostream.fileio;

import java.io.File;

public class Exam_ShowFileList {
	
	public static void main(String[] args) {
		File file = new File("C:\\windows");
		File[] subfiles = file.listFiles();
		for(int i = 0; i<subfiles.length; i++) {
			File fOne = subfiles[1];
			long time = fOne.lastModified();
			System.out.printf("%-35s" , fOne.getName());
			System.out.println("파일 크기 " + fOne.length() +"\t");
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT \n" 
					,time 
					,time
					,time
					,time
					);

		}
	}
}
















