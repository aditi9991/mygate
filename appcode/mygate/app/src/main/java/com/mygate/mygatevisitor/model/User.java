package com.mygate.mygatevisitor.model;

public class User {
    static String UserName;
    static String passCode;
    static String image;
    public User(String Username, String passcode , String encoded){
        this.UserName = Username;
        this.passCode = passcode;
        this.image = encoded;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassCode() {
        return passCode;
    }

    public String getImage() {
        return image;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
