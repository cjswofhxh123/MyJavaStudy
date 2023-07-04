package com.kh.day07.oop.member;

public class Member {
	//
	private String memberId;
	private String memberPW;
	private String memberEmail;
	private String memberAddress;
	
	public Member() {
		
	}
	public Member(
			String memberId,
			String memberPW,
			String memberEmail,
			String memberAddress) {
		this.memberId = memberId;
		this.memberPW = memberPW;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}
	
	//getter 메소드
	public String getMemberId() {
		return this.memberId;
	}
	public String getmemberPW() {
		return this.memberPW;
	}
	public String getmemberEmail() {
		return this.memberEmail;
	}
	public String getmemberAddress() {
		return this.memberAddress;
	}
	//setter 메소드 
	public void setMemberId(String MemberId) {
		this.memberId =memberId;
	}
	public void setMemberPW(String MemberPW) {
		this.memberPW =memberPW;
	}
	public void setMemberEmail(String MemberEmail) {
		this.memberEmail =memberEmail;
	}
	public void setMemberAddress(String MemberAddress) {
		this.memberAddress =memberAddress;
	}
}
