package com.cug.model.base;

import java.util.List;

/**
 * 前后端数据交互实体
* <p>Title: PowerResult</p>  
* <p>Description: </p>  
* @author LZF  
* @date 2018年8月11日
 */
public class PowerResult {
	
	/**
	 * 返回状态码
	 */
	private int code;
	
	/**
	 * 返回信息
	 */
	private String msg;
	
	/**
	 * 返回数据
	 */
	private List<?> list;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
	
}
