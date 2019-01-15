package com.cug.model;

import com.cug.po.Nowproject;

public class GetOtherProject {

	private String contractld;
	
	private String projectName;
	
	private String providerCompanyName;
	
	private String startTime;
	//项目开始时间
    private String endTime;

    private String content;
    
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
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
	public String getProviderCompanyName() {
		return providerCompanyName;
	}
	public void setProviderCompanyName(String providerCompanyName) {
		this.providerCompanyName = providerCompanyName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public void saveNowproject(Nowproject nowproject){
		this.setContractld(nowproject.getContractid());
		this.setProjectName(nowproject.getProjectname());  
		this.setProviderCompanyName(nowproject.getProvidercompanyname());
		this.setStartTime(nowproject.getStarttime());
		this.setEndTime(nowproject.getEndtime());
		this.setContent(nowproject.getContent());
	}
	@Override
	public String toString() {
		return "GetOtherProject [contractld=" + contractld + ", projectName=" + projectName + ", providerCompanyName="
				+ providerCompanyName + ", startTime=" + startTime + ", endTime=" + endTime + ", content=" + content
				+ "]";
	}
}
