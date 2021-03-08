package com.oop.exam.model;

import java.util.ArrayList;

public class User {
    private ArrayList<String> user;
    private String username;
    private String email;

    public User(String username, String email){
        user.add(username);
        user.add(email);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
