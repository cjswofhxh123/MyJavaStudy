package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Exam_ChattingClient {
	public static void main(String[] args) {
		String addresas = "192.168.60.225";
		int port = 7777;
		OutputStream os = null;
		InputStream is = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("연결 요청중");
			// 설정된 IP, PORT에 연결 요청함.
			Socket socket = new Socket(addresas, port);
			// 연결 된 후에는 소켓 객체 생성
			System.out.println("연결 성공");
			// 1.데이터 보내기
			// 프로그램 기준 나가니까 OutputStream
			os = socket.getOutputStream();

			System.out.println("클라이언트(나):");
			String messge = sc.nextLine();
			byte[] bytes = messge.getBytes();
			// 보낼떄 버퍼에 씀 write메소드 사용
			os.write(bytes);
			// 버퍼 비워주기 flush();
			os.flush();

			System.out.println("데이터 전송 성공");

			// -----------------보내기 완료
			// 4.데이터 받기
			// 프로그램 기준 들어오니까 InputStream
			is = socket.getInputStream();
			bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			messge = new String(bytes, 0, readByteNo);
			System.out.printf("서버(상대) :%s\n", messge);
			// --------------받기 완료

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
