package com.kh.day09.objectkg;

public class Exam_ObjectProperty {

	
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 :"  + obj.getClass().getName() );
		System.out.println("해시코드 값:" +  obj.getClass());//고유값
		System.out.println("객체를 문자열로 만들어 출력 :" + obj.toString());
		System.out.println("객체 출력: " + obj);

	}
	
	public static void main(String[] args) {
//		Point p = new Point(2,3);
//		Point p2 = new Point(2,3);
//		print(p);
//		print(p2);
		
		//Object 클래스의 equals 메소드: 내용비교
		String javaStr  = "JAVA";
		String javaStr2 = "JAVA";
		String javaStr3 = new String("java");
		//Type mismatch: cannot convert from String to int
		String[] strArrs = new String[10];
		strArrs[0] = "java";
		strArrs[1] = "java";
//		if(strArrs[0] == strArrs[1])
		if(javaStr.equals(javaStr3)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다");
		}
		
		
	}
}
