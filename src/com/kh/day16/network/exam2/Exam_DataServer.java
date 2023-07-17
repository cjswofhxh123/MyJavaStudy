package com.kh.day16.network.exam2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_DataServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os2 = null;
		
		try {
			serverSocket = new  ServerSocket(4885);
			System.out.println("서버소켓 생성 완료");
			System.out.println("클라인어트 연결 대기중...");
			Socket socket = serverSocket.accept();
			serverSocket.accept();
			System.out.println(" 연결 수락됨...");
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readByteNo =is.read(bytes);
			String message =
					new String(bytes,0,readByteNo);
			System.out.printf("데이터 받기 성공 :%s",message);
			//---------------------------------
			//----------------대이터 받기
			os2 = socket.getOutputStream();
			String message2 = "hello Server";
			byte[] buf2 = message2.getBytes();
			os2.write(buf2);
			os2.flush();
			System.out.println("데이터 전송완료2");	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
