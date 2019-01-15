package com.cug.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.cug.model.GetOtherProject;
import com.cug.model.getproject;
import com.cug.service.GetProjectService;

/**
 * 
 * <p>
 * Title: InEmployeeController
 * </p>
 * <p>
 * Description:显示项目和公司名称
 * </p>
 * 
 * @author LHD
 * @date 2018年11月3日
 */

@Controller
@RequestMapping("/inemployee")
public class InEmployeeController {

	@Autowired
	private GetProjectService getprojectservice;

	@RequestMapping("/getproject")
	@ResponseBody()
	public String getproject() {
		List<getproject> list = getprojectservice.findproject();

		return JSON.toJSONString(list);
	}

	// 向临时数据库添加数据
	// 存入数据库
	@RequestMapping("/indata")
	@ResponseBody
	public String indata(@RequestBody Map<String,Object> params) {
		System.out.println("你好 ");
		
		System.out.println(params.get("contractId").toString());
		System.out.println("我不好");
		String request=params.get("contractId").toString();
		
		getprojectservice.addother(request);
		System.out.println("调用该函数成功了");
		List<GetOtherProject> list =getprojectservice.returnproject();
		System.out.println("------------------");
		System.out.println(list);
		System.out.println("-------------------");
		return JSON.toJSONString(list);
	}
}