package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;

		try {
			reader = new FileReader("src/com/kh/day11/iostream/reader/reading.txt");
			int readerCharCount;
			char[] cBuf = new char[3];
			// int i = 0;
			String result = "";
			while (true) {
				readerCharCount = reader.read(cBuf);
				// System.out.print(readerCharCount);
				if (readerCharCount == -1)
					break;
				result += new String(cBuf, 0, readerCharCount);
//			for(char c :cBuf ) {
//				System.out.print(c);
//			}
//			System.out.println();
//			i++;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
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
