package com.sparkcw.community.dto;

public class Member {
	private int code;
	private String id;
	private String pw;
	private String nickname;
	private String email;
	
	public Member() {
		super();
	}
	
	public Member(int code, String id, String pw, String nickname, String email) {
		this.code = code;
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
		this.email = email;
	}
	
	public Member(String id, String pw, String nickname, String email) {
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
		this.email = email;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

