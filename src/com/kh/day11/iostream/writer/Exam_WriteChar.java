package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writer/writer2.txt");
			char [] cbuf = "I/0 Stream Good".toCharArray();
			writer.write(cbuf);
			writer.flush();
			System.out.println("writer(char[]) 동작완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
