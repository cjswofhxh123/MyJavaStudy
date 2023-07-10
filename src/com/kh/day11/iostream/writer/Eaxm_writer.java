package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Eaxm_writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer writer = null;
		
		//Unhandled exception type IOException
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing.txt");
			char [] data = "Java/Oracle/JDBC".toCharArray();
		for(int i =0; i <data.length; i++) {
			writer.write(data[i]);
			
		}
		writer.flush();
		System.out.println("파일 쓱디 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
