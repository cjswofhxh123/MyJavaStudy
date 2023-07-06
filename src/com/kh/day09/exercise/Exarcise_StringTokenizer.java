package com.kh.day09.exercise;

import java.util.StringTokenizer;

public class Exarcise_StringTokenizer {
	public static void main(String[] args) {
		//홍길동/장화/홍련/콩쥐/팥쥐의 문자열 데이터를
		// '/'기준으로 잘라서 홍련만 출력하시오
		String data1 ="홍길동/장화/홍련/콩쥐/팥쥐";
		
		StringTokenizer st = new StringTokenizer(data1,"/");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			if(st.nextToken().equals("홍련"));
				System.out.println(token);
		}
	
	}
}
