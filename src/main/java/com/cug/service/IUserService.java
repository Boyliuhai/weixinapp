package com.cug.service;

import com.cug.model.LoginUserRequest;
import com.cug.model.LoginUserResponse;

public interface IUserService {
	
	public LoginUserResponse userLogin(LoginUserRequest user) throws Exception;
	//用户登录
	
	public boolean validateUserToken(String token) throws Exception;
	//验证用户token

	public String getViewMenu(String token) throws Exception;
	//获取要显示的菜单项，根据digtial
	
//	public List<String> getArrayList() throws Exception;
}
