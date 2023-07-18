package com.kh.day17.network.socket.calculator;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorServer {
	public static void main(String[] args) {
		//서버 구동중입니다.
		//클라이언트의 연결을 기다리고 있습니다.
		//클라이언트와 연결되었습니다.
		//
		ServerSocket serverSocket = null;
		int port = 8888;
			InputStream is = null;
			OutputStream os = null;
			DataInputStream dis = null;
			DataOutputStream dos = null;			
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println("서버 구동중입니다.");
				for(int i = 1; i <=50; i++) {
					Thread.sleep(10);
					System.out.print("=");
			}
			System.out.println("100%");
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이너트 의 연결을 기다리고 있다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이너트 의 연결되엇습니다.");
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while(true) {
				//데이터 받기
				//-------------------
				
//				String recvMsg = dis.readUTF(); //받기
//				if(recvMsg.equalsIgnoreCase("exit")) {
//					System.out.println("클라이언트가 종료되엇습니다.");
//					break;
//				}
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트 가 종료되엇습니다.");
					break;
				
				}
				
				System.out.printf("받은 메시지 :%s\n",recvMsg);
				//
				String [] msgArrs = recvMsg.split(" ");
				if(msgArrs.length !=3) {
					String errMsg
					="end";
					dos.writeUTF(errMsg);
					continue;
				}
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operation = msgArrs[1];
				String result = "";
				switch (operation) {
				case "+":
					result 
					= 
					String.valueOf(num1+num2);
					break;
				case "-":
					result 
					= 
					String.valueOf(num1-num2);
					break;
				case "*":
					result 
					= String.valueOf(num1*num2);
//					result =num1 * num2 +"";
					break;
				case "/":
					result 
					= String.valueOf(num1/num2);

					break;
				case "%":
					result 
					= String.valueOf(num1%num2);
					break;
				}
				//결과 보내고 끝
				dos.writeUTF(result);
				dos.flush();
				}
			} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (InterruptedException e){
			e.printStackTrace();

		}

	}
}
