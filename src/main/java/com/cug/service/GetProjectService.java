package com.cug.service;

import java.util.List;

import com.cug.model.GetOtherProject;
import com.cug.model.getproject;
import com.cug.po.Nowproject;

public interface GetProjectService {
	
	//查出所有的合同
	public List<Nowproject> selectAllproject();
	//返回给合同
	public List<getproject> findproject();
	//返回给除合同之外到其他信息
	public List<GetOtherProject> returnproject();
	//查出部分合同
	public int addother(String request);
	//查询单条数据
	public  List<Nowproject> selectByConID(String id); 
	
}
