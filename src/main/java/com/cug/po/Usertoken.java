package com.cug.po;

public class Usertoken {
    private String digitalid;

    private String token;

    private String username;

    public String getDigitalid() {
        return digitalid;
    }

    public void setDigitalid(String digitalid) {
        this.digitalid = digitalid == null ? null : digitalid.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}