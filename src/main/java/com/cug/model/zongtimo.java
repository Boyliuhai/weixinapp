package com.cug.model;

import com.cug.po.Tempprojectemployee;

public class zongtimo {
	 private String IDCard="";
	 private String contractld;
	 private String  projectName;
	 private String  providerCompanyName;
	 private String startTime;
	 private String endTime;
	 private String name;
	 private String nation;
	 private String address;
	 private String  Birth;
	 private String  sex;
	 private String  phone;
	 private String  specialmessage;
	 private String  idCardFilePath;
	 private String  faceFilePath;
	 private String examReportFilePath;//此行为特殊证书
	 private String  insuranceFilePath;
	
	 
	 
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
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return Birth;
	}
	public void setBirth(String birth) {
		Birth = birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdCardFilePath() {
		return idCardFilePath;
	}
	public void setIdCardFilePath(String idCardFilePath) {
		this.idCardFilePath = idCardFilePath;
	}
	public String getFaceFilePath() {
		return faceFilePath;
	}
	public void setFaceFilePath(String faceFilePath) {
		this.faceFilePath = faceFilePath;
	}
	public String getExamReportFilePath() {
		return examReportFilePath;
	}
	public void setExamReportFilePath(String examReportFilePath) {
		this.examReportFilePath = examReportFilePath;
	}
	public String getInsuranceFilePath() {
		return insuranceFilePath;
	}
	public void setInsuranceFilePath(String insuranceFilePath) {
		this.insuranceFilePath = insuranceFilePath;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpecialmessage() {
		return specialmessage;
	}
	public void setSpecialmessage(String specialmessage) {
		this.specialmessage = specialmessage;
	}
	
	public Tempprojectemployee mapToDB(){
		Tempprojectemployee entity = new Tempprojectemployee();
		entity.setId(0);
		entity.setIdcard(this.getIDCard());
		entity.setCompanyname(this.getProviderCompanyName());
		entity.setContractid(this.getContractld());
		entity.setProjectname(this.getProjectName());
		entity.setName(this.getName());
		entity.setStarttime(this.getStartTime());
		entity.setEndtime(this.getEndTime());
		entity.setAge(this.getBirth());
		entity.setSex(this.getSex());
		entity.setNation(this.getNation());
		entity.setAddress(this.getAddress());
		entity.setPhone(this.getPhone());
		entity.setIdcardfilepath(this.getIdCardFilePath());
		entity.setFacefilepath(this.getFaceFilePath());
		entity.setExamreportfilepath(this.getExamReportFilePath());//此行为特殊证书
		entity.setInsurancefilepath(this.getInsuranceFilePath());
		entity.setIsspecial(this.getSpecialmessage());
		return entity;
	}


	
	
}
