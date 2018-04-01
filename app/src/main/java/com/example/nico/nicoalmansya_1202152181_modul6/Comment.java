package com.example.nico.nicoalmansya_1202152181_modul6;

/**
 * Created by Nico on 02/04/2018.
 */

public class Comment {

    String id;
    String username;
    String comment;
    Long timestamp;


    public Comment(String id, String username, String comment, Long timestamp) {
        this.id=id;
        this.username = username;
        this.comment = comment;
        this.timestamp=timestamp;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }
}