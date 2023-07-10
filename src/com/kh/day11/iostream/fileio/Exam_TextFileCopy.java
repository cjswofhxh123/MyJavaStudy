package com.kh.day11.iostream.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
//		문자 스트림 FileReader와 FileWriter를 이용하여 
//		c:\windows\system.ini를 c:\Temp\system.txt 파일로 복사하는 프로그램을 작성하라.
		Reader reader = null;
		Writer writer = null;
		File src = new File("c:\\windows\\system.ini");//원본 파일 경로명
		File dest = new File("c:\\Temp\\system.txt");//복사 파일 경로명
		
			try {
				reader = new FileReader(src);
				//readCharCocunt = reader.read("c:\\windows\\system.ini");
				File folderMake = new File ("c:\\Temp");
				if(!folderMake.exists()) {
					folderMake.mkdir();
				}
				writer = new FileWriter(dest);
				int readChar;
				while(true) {
					readChar =reader.read();
					if(readChar == -1)break;
					writer.write((char)readChar);
			}
				System.out.println("복사완료");
				reader.close();
				writer.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				
			} catch (IOException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		
		
		
		//		InputStream is = null;
//		OutputStream os = null;
//		
//		try {
//			is = new FileInputStream("C:\\windows\\system.ini");
//			os = new FileOutputStream("c:\\Temp\\system.txt");
//			
//			byte[] readByte = new byte[1024];
//
//			int readByteCount;
//			
//			while ((readByteCount =is.read(readByte)) != -1);
//			os.write(readByte, 0, readByteCount);
//			os.flush();
//			System.out.println("복사가 완료되었습니다.");
//			
//			
//		}catch (IOException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}finally {
//			try {
//				is.close();
//				
//			}catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		}
	
	}

}
