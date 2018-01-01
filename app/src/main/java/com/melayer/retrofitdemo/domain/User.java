package com.melayer.retrofitdemo.domain;

import java.io.Serializable;

/**
 * Created by  on 18/11/17.
 */

public class User implements Serializable {
    private String id;

    private String mobileNo;
    private String emailId;
    private String password;
    private String firstName;
    private String fullName;
    private String lastName;
    private Boolean facebookUser = false;
    private Boolean gPlusUser= false;
    private Boolean adminFlag;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;

    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getFacebookUser() {
        return facebookUser;
    }

    public void setFacebookUser(Boolean facebookUser) {
        this.facebookUser = facebookUser;
    }

    public Boolean getgPlusUser() {
        return gPlusUser;
    }

    public void setgPlusUser(Boolean gPlusUser) {
        this.gPlusUser = gPlusUser;
    }

    public Boolean getAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(Boolean adminFlag) {
        this.adminFlag = adminFlag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", facebookUser=" + facebookUser +
                ", gPlusUser=" + gPlusUser +
                ", adminFlag=" + adminFlag +
                '}';
    }
}
