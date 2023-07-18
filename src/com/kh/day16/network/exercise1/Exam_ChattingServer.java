package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exam_ChattingServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc =new Scanner(System.in);
		try {
			serverSocket =new ServerSocket(7777);
			System.out.println("서버소켓 생성");
			System.out.println("클라이언접속 대기중");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트ㅏ접속");

			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			String message = new String(bytes,0,readByteNo);
			System.out.printf("클라이언트(상대): %s\n",message);
			//----------------------받기 완료
			//프로그램 기준 OutputStream
			os = socket.getOutputStream();
			System.out.println("서버(나) :");
			message = sc.nextLine();
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 성공");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

