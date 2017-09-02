package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    int userID;
    String username;
    char sex;
    LocalDate birthdate;
    int postsPublished;

    public ForumUser(final int userID, final String username, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postsPublished) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthdate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);;
        this.postsPublished = postsPublished;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostsPublished() {
        return postsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", postsPublished=" + postsPublished +
                '}';
    }
}
