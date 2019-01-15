package com.cug.model;

import java.util.List;

import com.cug.po.Providercompanytemp;

public class ProjectMessage {
	
	private int id;
	
	private String contractId;
	
	private String nowworker;
	
	private String allworker;
	
	private String powerpeople;
	
	private String powpeoplephone;
	
	
	private List<GetOtherProject> otherproject;
	
	private List<Proprovider> proproviders;

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

	public String getNowworker() {
		return nowworker;
	}

	public void setNowworker(String nowworker) {
		this.nowworker = nowworker;
	}

	public String getAllworker() {
		return allworker;
	}

	public void setAllworker(String allworker) {
		this.allworker = allworker;
	}

	public List<GetOtherProject> getOtherproject() {
		return otherproject;
	}

	public void setOtherproject(List<GetOtherProject> otherproject) {
		this.otherproject = otherproject;
	}
	
	public List<Proprovider> getProproviders() {
		return proproviders;
	}

	public void setProproviders(List<Proprovider> proproviders) {
		this.proproviders = proproviders;
	}
	public String getPowerpeople() {
		return powerpeople;
	}

	public void setPowerpeople(String powerpeople) {
		this.powerpeople = powerpeople;
	}

	public String getPowpeoplephone() {
		return powpeoplephone;
	}

	public void setPowpeoplephone(String powpeoplephone) {
		this.powpeoplephone = powpeoplephone;
	}
	public void ProMessageFromDB(Providercompanytemp providercompanytemp){
		this.setId(0);
		this.setContractId(providercompanytemp.getContractid());
		this.setNowworker(providercompanytemp.getNowworker());
		this.setAllworker(providercompanytemp.getAllworker());
		this.setPowerpeople(providercompanytemp.getPowerpeople());
		this.setPowpeoplephone(providercompanytemp.getPowpeoplephone());
	}
	@Override
	public String toString() {
		return "ProjectMessage [id=" + id + ", contractId=" + contractId + ", nowworker=" + nowworker + ", allworker="
				+ allworker + ", powerpeople=" + powerpeople + ", powpeoplephone=" + powpeoplephone + ", otherproject="
				+ otherproject + ", proproviders=" + proproviders + "]";
	}
}
