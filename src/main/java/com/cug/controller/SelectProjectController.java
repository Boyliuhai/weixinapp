package com.cug.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cug.model.ProjectMessage;
import com.cug.model.getproject;
import com.cug.service.SelectProjectService;

/**
 * 
 * <p>
 * Title: SelectProjectController
 * </p>
 * <p>
 * Description:显示项目和公司名称
 * </p>
 * 
 * @author LHD
 * @date 2018年11月19日
 */

@Controller
@RequestMapping("/selectProject")
public class SelectProjectController {
	
	@Autowired
	private SelectProjectService selectprojectservice;

	@RequestMapping("/returnProject")
	@ResponseBody()
	public String returnProject(@RequestBody Map<String,Object> params){
		
		System.out.println("这里进入了returnProject");
		System.out.println(params.get("username").toString());
		String request=params.get("username").toString();
		
		List<getproject> list =selectprojectservice.addProject(request);
		System.out.println("操作结束");
		System.out.println(list);
		return JSON.toJSONString(list);
	
	}
	
	@RequestMapping("/indata")
	@ResponseBody
	public  List<ProjectMessage> indata(@RequestBody Map<String,Object> params) {
	
		String request=params.get("contractId").toString();
		
		List<ProjectMessage> list = selectprojectservice.addnowproject(request);
		System.out.println("调用成功了");
		System.out.println(list.toString());
		return list;
	}
}
