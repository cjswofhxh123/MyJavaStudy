package com.kh.day10.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.day10.collection.student.Student;

public class Exam_MapColleciton {
	public static void main(String[] args) {
	
		Map<String, Student> stdMap = new HashMap<String,Student>();
		stdMap.put("one", new Student ("타이타닉",44,46));
		stdMap.put("two", new Student ("타이타닉",44,46));

		System.out.println("첫번쨰 학생" + stdMap.get("one"));
		System.out.println("두번째 학생" + stdMap.get("two"));

	
	}
		
	public void mapExample2() {
		Map<String, Object> objMap = new HashMap<String,Object>();
		objMap.put("name", "손풍기");
		objMap.put("price", 1500);
		objMap.put("isGood", true);
		System.out.println("상품 이름은 " + objMap.get("name"));
		System.out.println("가격은 " + objMap.get("price") + "원");
		String result = (boolean)objMap.get("isGood") ? "추천" : "비추천";
		System.out.println("추천 여부는 " +"result");
	
	}
	
	public void mapExample() {
		Map<String, String> map = new HashMap<String,String>();
		//String Number = "02";
		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("061", "전라도");
		map.put("053", "대구");
		System.out.println("저장된 데이터의 수:" + map.size());
		System.out.println("02를 누르면 서울이 나옵니다. :" + map.get("02"));
		System.out.println("031 누르면 경기도가 나옵니다. :" + map.get("031"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("지역번호 입력:");
		String regionCode = sc.next();
		System.out.println("입력하신 지역번호에 대한 지역은: " +map.get(regionCode));
		
		
	}
}
