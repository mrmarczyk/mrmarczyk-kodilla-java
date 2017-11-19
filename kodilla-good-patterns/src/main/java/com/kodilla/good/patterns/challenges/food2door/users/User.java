package com.kodilla.good.patterns.challenges.food2door.users;

public class User {

    private final String userID;
    private final String userName;
    private final String userMail;
    private final int userAge;

    public User(String userID, String userName, String userMail, int userAge) {
        this.userID = userID;
        this.userName = userName;
        this.userMail = userMail;
        this.userAge = userAge;
    }
    public int getUserAge() { return userAge; }

    public String getUserName() {
        return userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getUserID() { return userID; }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userMail='" + userMail + '\'' +
                '}';
    }
}