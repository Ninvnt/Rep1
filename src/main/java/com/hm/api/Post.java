package com.hm.api;


public class Post {
    private String message;
    private String userLogin;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getuserLogin() {
        return userLogin;
    }

    public void setuserLogin(String userid) {
        this.userLogin = userid;
    }
}
