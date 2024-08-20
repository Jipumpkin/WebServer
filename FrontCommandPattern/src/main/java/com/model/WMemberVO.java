package com.model;

public class WMemberVO {
	private String id;
	private String pw;
	private String nick;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
	public WMemberVO(String id, String pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	
	public WMemberVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	
	
	
	
}
