package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// c드라이브에 있는 파일을 E드라이브로 복사
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:\\copy\\캡처.PNG");
			os = new FileOutputStream("E:\\캡처.PNG");
			byte[] readByte = new byte[1024];
			int readByteCount;
			// 파일 복사 -> 읽어들인 후 원하는 경로에 출력하기
			while ((readByteCount = is.read(readByte)) != -1);
			// System.out.println(readByte);
			os.write(readByte, 0, readByteCount);
			os.flush();
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// TODO: handle exception
		}
	}
	
}
