package com.kh.day11.iostream.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer writer  =null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writer/writer3.txt");
			char [] cBuf = "ddddd".toCharArray();
			writer.write(cBuf);
			writer.flush();
			System.out.println("쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
