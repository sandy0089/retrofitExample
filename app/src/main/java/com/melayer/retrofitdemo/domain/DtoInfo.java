package com.melayer.retrofitdemo.domain;

import java.util.Map;

/**
 * Created by melayer on 18/11/17.
 */

public class DtoInfo {
    private String success;

    private String status;

    private User user;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "DtoInfo{" +
                "success='" + success + '\'' +
                ", status='" + status + '\'' +
                ", user=" + user +
                '}';
    }
}
