package com.travel_diaries.traveldiaries;

/**
 * Created by nilesh on 5/11/16.
 */

public class User {
    String name, password, username, mobile, email;

    public User(String name, String username, String mobile, String password, String email) {
        this.name = name;
        this.username = username;
        this.email= email;
        this.password = password;
        this.mobile = mobile;
    }
}
