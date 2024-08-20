package com.model;

public class MemberDTO {
	
	// 한사람 회원의 정보를 저장하는 클래스
	
	private String email;
	private String pw;
	private String phone;
	private String addr;
	
	
	//회원가입 생성자
	public MemberDTO(String email, String pw, String phone, String addr) {
		// super();
		// 자식클래스의 생성자를 호출하는순간 부모클래스의 생성자는 반드시 호출된다.
		this.email = email;
		this.pw = pw;
		this.phone = phone;
		this.addr = addr;
	}
	
	
	//로그인 생성자	
	public MemberDTO(String email, String pw) {
		this.email = email;
		this.pw = pw;
	
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
	
}
