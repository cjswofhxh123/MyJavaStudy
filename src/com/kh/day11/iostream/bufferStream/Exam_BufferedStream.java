package com.kh.day11.iostream.bufferStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {
	public static void main(String[] args) {
		//버퍼 크기를 5로 하고 표준 출력 스트림(System.out)과 연결한 
		//버퍼 출력 스트림 을 생성하라!.
		FileReader fir =null;
		int readCharCount;
		BufferedOutputStream bout =  new BufferedOutputStream(System.out,5);
//		System.out.println("전달값");
		Scanner sc = new Scanner(System.in);
		
		try {
			fir = new FileReader("src/com/kh/day11/iostream/bufferStream/javascript.txt");
			while ((readCharCount = fir.read()) != -1) {
				bout.write(readCharCount);
			}
			bout.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			 try {
				bout.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
