package com.cug.service;

import java.util.List;

import com.cug.model.ProjectMessage;
import com.cug.model.getproject;
import com.cug.po.Loginuserinfo;
import com.cug.po.Nowproject;
import com.cug.po.Projectprovidertemp;
import com.cug.po.Providercompanytemp;

public interface SelectProjectService {
	
	public List<ProjectMessage> addnowproject(String request);
	//根据id查询出公司现有工作人数，总人数
	public List<Providercompanytemp> selectByContID(String id);
	//查询Providercompanytemp PO类的信息

	public List<Projectprovidertemp> selectByProviderID(String id1);
	//根据id查出公司的负责人信息
	
	public List<Nowproject> selectByConID(String id2);
	//根据id查出公司的基本信息
	
	public List<getproject> addProject(String request);
	
	
	public List<Loginuserinfo> selectByUseName(String id3);
	//根据用户名查询是否是电厂还是外委公司
	
	public List<Nowproject> selectAllproject();
	//查出所有的合同
	
	public List<Projectprovidertemp> selectById(String id4);
}
