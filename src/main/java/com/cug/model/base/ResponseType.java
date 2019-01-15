package com.cug.model.base;

public class ResponseType<TEntity> {
	
	//状态码:0表示正常；1表示用户信息错误；2表示请求信息有误；3表示其他错误
	private Integer status;
	
	//具体出错信息：如果status为0，这里为空
	private String errorDetail;
	
	//数据类型
	private TEntity body;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErrorDetail() {
		return errorDetail;
	}

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}

	public TEntity getBody() {
		return body;
	}

	public void setBody(TEntity body) {
		this.body = body;
	}
	
	
	
}
