package com.cug.po;

public class Nowproject {
    private String contractid;

    private String projectname;

    private String content;

    private String professions;

    private String projecttype;

    private String starttime;

    private String endtime;

    private String providercompanyname;

    private String supervisorcompanyname;

    private Float amount;

    private Integer taxrate;

    private String projectfilepath;

    private String contractfilepath;

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid == null ? null : contractid.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getProfessions() {
        return professions;
    }

    public void setProfessions(String professions) {
        this.professions = professions == null ? null : professions.trim();
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype == null ? null : projecttype.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getProvidercompanyname() {
        return providercompanyname;
    }

    public void setProvidercompanyname(String providercompanyname) {
        this.providercompanyname = providercompanyname == null ? null : providercompanyname.trim();
    }

    public String getSupervisorcompanyname() {
        return supervisorcompanyname;
    }

    public void setSupervisorcompanyname(String supervisorcompanyname) {
        this.supervisorcompanyname = supervisorcompanyname == null ? null : supervisorcompanyname.trim();
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Integer taxrate) {
        this.taxrate = taxrate;
    }

    public String getProjectfilepath() {
        return projectfilepath;
    }

    public void setProjectfilepath(String projectfilepath) {
        this.projectfilepath = projectfilepath == null ? null : projectfilepath.trim();
    }

    public String getContractfilepath() {
        return contractfilepath;
    }

    public void setContractfilepath(String contractfilepath) {
        this.contractfilepath = contractfilepath == null ? null : contractfilepath.trim();
    }
}