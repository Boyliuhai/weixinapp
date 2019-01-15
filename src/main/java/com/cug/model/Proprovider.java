package com.cug.model;

import com.cug.po.Projectprovidertemp;

public class Proprovider {
	private int id;
	
	private String contractId;
	
	private String idCard;
	
	private String name;
	
	private String companyName;
	
	private String post;
	
	private String phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void saveProviderFromDB(Projectprovidertemp projectprovidertemp ){
		this.setId(0);
		this.setContractId(projectprovidertemp.getContractid());
		this.setIdCard(projectprovidertemp.getIdcard());
		this.setName(projectprovidertemp.getName());
		this.setCompanyName(projectprovidertemp.getCompanyname());
		this.setPost(projectprovidertemp.getPost());
		this.setPhone(projectprovidertemp.getPhone());
	}
	
	public  void saveProFromDB(Projectprovidertemp projectprovidertemp) {
		
		// TODO Auto-generated method stub
		this.setContractId(projectprovidertemp.getContractid());
		this.setCompanyName(projectprovidertemp.getCompanyname());
	}
	
	@Override
	public String toString() {
		return "Proprovider [id=" + id + ", contractId=" + contractId + ", idCard=" + idCard + ", name=" + name
				+ ", companyName=" + companyName + ", post=" + post + ", phone=" + phone + "]";
	}
	
}