package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averPostsPerUser;
    private double averCommentsPerUser;
    private double averCommentsPerPost;

    public ForumStatistics (int numberOfUsers, int numberOfPosts, int numberOfComments, double averPostsPerUser, double averCommentsPerUser,  double averCommentsPerPost) {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.averPostsPerUser = averPostsPerUser;
        this.averCommentsPerUser = averCommentsPerUser;
        this.averCommentsPerPost = averCommentsPerPost;
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

    public void calculateAdvStatistics(Statistics statistics) {

    }

    public void showStatistics () {

    }
}
