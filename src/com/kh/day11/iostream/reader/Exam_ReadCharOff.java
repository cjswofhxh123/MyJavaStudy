package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;

		try {
			// 주석
			reader = new FileReader("src/com/kh/day11/iostream/reader/reading.txt");
			//
			int readCharCount;
			//
			char[] cBuf = new char[3];
			// int i = 0;
			String result = "";
			while (true) {
				readCharCount = reader.read(cBuf, 0, 3);
				// System.out.println(readCharCount);
				if (readCharCount == -1)
					break;
				result += new String(cBuf, 0, readCharCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}
}
