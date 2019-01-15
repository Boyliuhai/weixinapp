package com.cug.model;

import com.cug.po.Loginuserinfo;

public class GetloginuserInfo {
	private int id;
	
	private String userName;
	
	private int userType;
	
	private String digitalId;



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserType() {
		return userType;
	}


	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	public String getDigitalId() {
		return digitalId;
	}


	public void setDigitalId(String digitalId) {
		this.digitalId = digitalId;
	}

	public  void saveLoginuSerInfoFromDB(Loginuserinfo loginuserinfo){
		this.setId(0);
		
		this.setUserName(loginuserinfo.getUsername());
		this.setUserType(loginuserinfo.getUsertype());
		this.setDigitalId(loginuserinfo.getDigitalid());
	  }
	public Loginuserinfo map(){
		Loginuserinfo entity = new Loginuserinfo();
		entity.setId(null);
		entity.setUsername(this.getUserName());
		entity.setUsertype(this.getUserType());
		entity.setDigitalid(this.getDigitalId());
		return entity;
	}


	@Override
	public String toString() {
		return "GetloginuserInfo [id=" + id + ", userName=" + userName + ", userType=" + userType + ", digitalId="
				+ digitalId + "]";
	}
	
	
}
