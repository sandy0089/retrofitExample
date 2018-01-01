package com.melayer.retrofitdemo.domain;

import java.util.Map;

/**
 * Created by melayer on 18/11/17.
 */

public class LoginCredential {
    private String username;

    private String password;

    private Map<String, Object> responseObject;

    public LoginCredential(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Object> getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(Map<String, Object> responseObject) {
        this.responseObject = responseObject;
    }

    @Override
    public String toString() {
        return "LoginCredential{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", responseObject=" + responseObject +
                '}';
    }
}
