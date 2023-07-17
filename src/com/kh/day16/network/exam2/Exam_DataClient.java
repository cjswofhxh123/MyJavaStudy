package com.kh.day16.network.exam2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam_DataClient {
	public static void main(String[] args) {
		OutputStream os = null;
		InputStream os2 = null;
		String ipAddress = "127.0.0.1";
		int port= 4885;
		
		try {
			System.out.println("연결 요청");
			Socket socket = new Socket(ipAddress,port);
			System.out.println("연결 성공");
			
			//----------------데이터 보내기-----------
			os = socket.getOutputStream();
			String message = "hello Server!";
			byte [] buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			//----------------대이터 보내기
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
	
}
