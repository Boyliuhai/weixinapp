package com.cug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cug.model.zongtimo;
import com.cug.service.zongheService;

/**
 * 
* <p>Title: zongtiController</p>  
* <p>Description:最后返回所有信息</p>  
* @author LHD  
* @date 2018年11月3日
 */

@Controller
@RequestMapping("/zongti")
public class zongtiController {
	
	@Autowired
	private zongheService ZongheService;
	
	@RequestMapping("/ziti")
	@ResponseBody
	public String returnzitimessage(@RequestBody zongtimo request){
		
		int code = ZongheService.addData(request);
		return JSON.toJSONString(code);
	}
	@RequestMapping("/tuxiang")
	@ResponseBody
	public String returntuxiangmessage(){
			
			
		return null;
		
	}
}
