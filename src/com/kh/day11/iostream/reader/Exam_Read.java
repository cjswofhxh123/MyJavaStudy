package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_Read {

	public static void main(String[] args) {

		Reader reader = null;
		Writer writer = null;
		// Cannot instantiate the type Reader
		try {

			reader = new FileReader("src/com/kh/day11/iostream/reader/reading.txt");

			while (true) {

				int readData = reader.read();
				if (readData == -1)
					break;
				System.out.print((char) readData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	// Unhandled exception type FileNotFoundException
}
