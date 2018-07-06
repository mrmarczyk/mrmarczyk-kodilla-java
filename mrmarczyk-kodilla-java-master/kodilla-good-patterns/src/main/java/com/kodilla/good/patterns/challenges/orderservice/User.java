package com.kodilla.good.patterns.challenges.orderservice;

public class User {

    private final String userID;
    private final String userName;
    private final String userMail;

    public User(String userID, String userName, String userMail) {
        this.userID = userID;
        this.userName = userName;
        this.userMail = userMail;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserMail() {
        return userMail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userMail='" + userMail + '\'' +
                '}';
    }
}
