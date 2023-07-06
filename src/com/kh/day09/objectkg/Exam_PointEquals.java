package com.kh.day09.objectkg;

public class Exam_PointEquals {
	//point 클래스에 두점의 좌표가 같으면 
	//true를 리턴하는 equals를 작성하고
	//2,3 포인트  객체와 2,3 포인트 객체가 
	//같은지 출력하세오
	//같을떄 출력 메세지
	//좌표가 같습니다.
	//다를 떄 출력 메시지
	//좌표가 다릅니다
	public static void main(String[] args) {
		Point point1 =new Point();
		Point point2 = new Point();
		if(point1.equals(point2)) {
			System.out.println("좌표가 같습니다");
		}else {
			System.out.println("좌표가 다릅니다.");
		}
	}
//		String str = "JAVA";
//		String str2 = "JAVA";
//		String str3 = new String("java");
//		
	
}
