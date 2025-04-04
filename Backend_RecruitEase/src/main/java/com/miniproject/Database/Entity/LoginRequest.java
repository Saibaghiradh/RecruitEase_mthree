package com.miniproject.Database.Entity;

public class LoginRequest {

    private String uname;
    private String password;

    // Constructors
    public LoginRequest() {}

    public LoginRequest(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    // Getters and Setters
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
