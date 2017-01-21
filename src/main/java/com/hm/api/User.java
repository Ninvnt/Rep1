package com.hm.api;

import java.util.UUID;

public class User {
    private String id;
    private String login;
    private String pass;

    public User() {}
    public User (String login, String pass) {
        this.login = login;
        this.pass = pass;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

