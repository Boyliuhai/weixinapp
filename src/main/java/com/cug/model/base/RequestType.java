package com.cug.model.base;

public class RequestType<TEntity> {
	
	private String token;
	
	private TEntity body;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public TEntity getBody() {
		return body;
	}

	public void setBody(TEntity body) {
		this.body = body;
	}
	
	

}
