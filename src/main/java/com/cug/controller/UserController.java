package com.cug.controller;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cug.model.LoginUserRequest;
import com.cug.model.LoginUserResponse;
import com.cug.model.base.RequestType;
import com.cug.model.base.ResponseType;
import com.cug.service.IUserService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService iUserService;
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestBody RequestType<LoginUserRequest> request) throws Exception{
		System.out.println(request);
		ResponseType<LoginUserResponse> response = new ResponseType<>();
		System.out.println("-------------");
		System.out.println("进入了/login");
		System.out.println("-------------");
		response.setStatus(1);
		//这是干嘛的啊——————————————————————————？？？？？？
		LoginUserResponse body = iUserService.userLogin(request.getBody());
		if(StringUtils.isNotBlank(body.getToken())){
			response.setStatus(0);
			response.setBody(body);
		}else{
			response.setErrorDetail("用户或密码有误");
		}
		
		JSONObject jsonObject = JSONObject.fromObject(response);
		System.out.println("这里做测试第一次返回的是什么");
		System.out.println(jsonObject.toString());
		return jsonObject.toString();
	}
	
	@RequestMapping("/getViewMenu")
	@ResponseBody
	public String getViewMenu(@RequestBody RequestType<String> requset) throws Exception{
		System.out.println("-------------");
		System.out.println("进入了/getViewMenu");
		System.out.println("-------------");
		ResponseType<String> response = new ResponseType<>();
		
		String menuJSON = iUserService.getViewMenu(requset.getToken());
		
		//判断是否成功
		if(!StringUtils.isNotBlank(menuJSON)){
			
			response.setStatus(1);
			response.setErrorDetail("用户信息有误，请重新登录");
			return JSONObject.fromObject(response).toString();
		}
		
		response.setStatus(0);
		response.setBody(menuJSON);
		
		return JSONObject.fromObject(response).toString();		
	}
}
