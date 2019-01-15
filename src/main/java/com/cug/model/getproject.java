package com.cug.model;

import com.cug.po.Nowproject;

public class getproject {
	private String contractld;
	
	private String projectName;

	public String getContractld() {
		return contractld;
	}

	public void setContractld(String contractld) {
		this.contractld = contractld;
	}

	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//根据数据库中Nowproject在转存过来
	public void saveNowproject(Nowproject nowproject){
		this.setContractld(nowproject.getContractid());
		this.setProjectName(nowproject.getProjectname());  
	}

	@Override
	public String toString() {
		return "getproject [contractld=" + contractld + ", projectName=" + projectName + "]";
	}
	
}
