package com.example.nico.nicoalmansya_1202152181_modul6;

/**
 * Created by Nico on 02/04/2018.
 */

public class User {

    String userId;
    String username;
    String email;

    public User() {
    }

    public User(String userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {

        return email;
    }
}
