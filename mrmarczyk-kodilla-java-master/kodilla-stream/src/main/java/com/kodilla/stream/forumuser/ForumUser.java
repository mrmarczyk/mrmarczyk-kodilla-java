package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    int userID;
    String username;
    char sex;
    LocalDate birthdate;
    int postsPublished;

    private ForumUser(final int userID, final String username, final char sex, final LocalDate birthdate, final int postsPublished) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthdate = birthdate;
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

    public static final class ForumUserBuilder {
        int userID;
        String username;
        char sex;
        LocalDate birthdate;
        int postsPublished;

        public ForumUserBuilder() {
        }

        public ForumUserBuilder userID(int userID) {
            this.userID = userID;
            return this;
        }

        public ForumUserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public ForumUserBuilder sex(char sex) {
            this.sex = sex;
            return this;
        }

        public ForumUserBuilder birthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public ForumUserBuilder postsPublished(int postsPublished) {
            this.postsPublished = postsPublished;
            return this;
        }

        public ForumUser build() {
            return new ForumUser(userID, username, sex, birthdate, postsPublished);
        }
    }
}
