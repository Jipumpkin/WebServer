package com.model;

public class MessageDTO {
	
	
	private String name;
	private String email;
	private String contents;
	private String indate;
	private int num;
	
	
	
	 



	// 메세지 생성자
	public MessageDTO(String name, String email, String contents) {
		// super();
		// 자식클래스의 생성자를 호출하는순간 부모클래스의 생성자는 반드시 호출된다.
		this.name = name;
		this.email = email;
		this.contents = contents;
	}
	public MessageDTO(int num, String name, String email, String contents, String indate) {
		// super();
		// 자식클래스의 생성자를 호출하는순간 부모클래스의 생성자는 반드시 호출된다.
		this.num = num;
		this.name = name;
		this.email = email;
		this.contents = contents;
		this.indate = indate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	public String getIndate() {
		return indate;
	}


	public void setIndate(String indate) {
		this.indate = indate;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	
}
