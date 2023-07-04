package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {
	private Member[] memArrs;
	private int index;

	public MemberFunction() {
		memArrs = new Member[3];
		index = 0;
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원관리프로그램");
		System.out.println("1.회원정보입력");
		System.out.println("2.회원정보출력");
		System.out.println("3. 프로그램 종료");
		System.out.println("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;

	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========회원가입입력");
		System.out.println("아이디:");
		String memberId = sc.next();
		System.out.println("비밀번호:");
		String memberPW = sc.next();
		System.out.println("이메일 :");
		String memberEmail = sc.nextLine();
		System.out.println("주소 :");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		
//		memArrs[0] = new Member();
//		memArrs[0].setMemberId(memberId);
//		memArrs[0].setMemberPW(MemberPW);
//		memArrs[0].setmemberEmail(memberEmail);
//		memArrs[0].setmemberAddress(memberAddress);
		
		memArrs[index] = new Member(memberId,memberPW,memberEmail,memberAddress); 
		index++;
		}

	public void printinfo() {
		System.out.println("회원정보출력");
		for (int i = 0; i < index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s입니다.", memArrs[i].getMemberId(),
					memArrs[i].getmemberPW(), memArrs[i].getmemberEmail(), memArrs[i].getmemberAddress());
		}

	}
}
