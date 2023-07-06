package com.kh.day09.javaapi;

import java.util.Iterator;

public class Exam_String {
	public static void main(String[] args) {
		String msg = "Hello java";
		msg = new String("Hello java");
		//내용은 같으나 주소가 달라짐
		//내용비교 equals를 이용하여 값을 비교해야함!
		
		String data1 = new String("C#");
		String data2 = new String(",C++");
		System.out.println(data1+"의 길이는"+ data1.length());
		System.out.println(data2+"의 길이는 "+data2.length());
		System.out.println("#이 있는가?" + data1.contains("#"));
	
		//문자열 포함 
		System.out.println("#잉 있는가 :" +data1.contains("#"));
	
		//문자열 연결
		data1 =data1.concat(data2);//C#,C++
		System.out.println("연결된 문자열 :" + data1);
		
		
		//공백 제거
		data1 = data1.trim();
		System.out.println("공백제거 확인 :" + data1);
		
		
		//문자열 교체
		data1 = data1.replace("C#","JAVA");
		System.out.println("문자열 고장" + data1);

		//문자열 분리
		String [] words = data1.split(",");
		for(int i = 0; i<words.length; i++) {
			System.out.println(words[i] + "/");
		}
		//System.out.println("문자열 분리" + words);
//		System.out.println(words[0]);
//		System.out.println(words[1]);

		//문자열 자르기
		//JAVA,C++
		System.out.println();
//		data1 = data1.substring(5);
//		System.out.println("문자열 자르기" + data1);
		data1 = data1.substring(0,4);
		System.out.println("범위 자르기: "+ data1);
		
		char word =data1.charAt(4);
		System.out.println("문자 자르기:" + word);
		
		
		
		
		
		
		
	
	
	}
}
