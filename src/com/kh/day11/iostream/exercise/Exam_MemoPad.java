package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("저정할 파일명 입력:");
		String fileName = sc.nextLine();
		//경로 입력 및 파일명으로 파일생성해줌
		Writer writer = null;
		
		
		writer = new FileWriter("" + fileName + ".txt");
		//무한반복하여 입력하는데 exit를 입력하면무한반복에서 빠져나옴
				System.out.println(:"종룐는 exit");
		for(int i = 1;; i++){
			System.out.println(i+ ":");
			String input= sc.nextLine();
			writer.write(input,"\n");			//exit을 입력하면 무한바복 빠져나오기
			if(input.equals("exit"))break;
		}
		writer.flush();
		System.out.println("파일저장이 완료되엇습니다.");
		System.out.println(""); 
		
	}
	
	} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				Writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// TODO: handle exception
		}
		
		
	}
}