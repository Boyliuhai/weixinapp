package com.cug.model;

public class LoginUserResponse {
	
	String name;
	//用户真实姓名
	String  userName;
	//用户名
	String token;
	//响应token
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
