package com.hm.api;

import java.util.ArrayList;

public class Topic {
    private ArrayList<String> posts = new ArrayList<>();
    private String name;

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }

    public void setName(String name) { this.name = name;}

    public String getName() {
        return name;
    }
}
