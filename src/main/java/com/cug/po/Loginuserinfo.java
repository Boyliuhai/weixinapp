package com.cug.po;

public class Loginuserinfo {
    private Integer id;
    //自增id
    private String username;
    //用户名
    private String password;
    //密码
    private String name;
    //真实名
    private Integer usertype;
    //用户类型
    private String digitalid;
    //
    private Integer userlevel;

    private Integer accountstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getDigitalid() {
        return digitalid;
    }

    public void setDigitalid(String digitalid) {
        this.digitalid = digitalid == null ? null : digitalid.trim();
    }

    public Integer getUserlevel() {
        return userlevel;
    }

    public void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }

    public Integer getAccountstate() {
        return accountstate;
    }

    public void setAccountstate(Integer accountstate) {
        this.accountstate = accountstate;
    }
    
}