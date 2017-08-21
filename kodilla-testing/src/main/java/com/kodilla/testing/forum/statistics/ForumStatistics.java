package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averPostsPerUser;
    private double averCommentsPerUser;
    private double averCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if ( numberOfUsers == 0 ) {
            averPostsPerUser = 0;
        } else {
            averPostsPerUser = numberOfPosts / numberOfUsers;
        }

        if ( numberOfUsers == 0 ) {
            averCommentsPerUser = 0;
        } else {
            averCommentsPerUser = numberOfComments / numberOfUsers;
        }

        if ( numberOfPosts == 0 ) {
            averCommentsPerPost = 0;
        } else {
            averCommentsPerPost = numberOfComments / numberOfPosts;
        }

    }

    public void showStatistics () {

    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverPostsPerUser() {
        return averPostsPerUser;
    }

    public double getAverCommentsPerUser() {
        return averCommentsPerUser;
    }

    public double getAverCommentsPerPost() {
        return averCommentsPerPost;
    }

}
