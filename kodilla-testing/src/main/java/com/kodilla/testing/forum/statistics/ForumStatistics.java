package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averPostsPerUser;
    private double averCommentsPerUser;
    private double averCommentsPerPost;

    private void storeBasicStats (Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
    }

    private void calculateAverPostsPerUser() {

        if (numberOfUsers == 0 || numberOfPosts == 0) {
            averPostsPerUser = 0;
        } else averPostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
    }

    private void calculateAverCommentsPerUser() {
        if (numberOfUsers == 0 | numberOfComments == 0) {
            averCommentsPerUser = 0;
        } else averCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
    }

    private void calculateAverCommentsPerPost() {
        if (numberOfPosts == 0 || numberOfComments == 0) {
            averCommentsPerPost = 0;
        } else averCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        storeBasicStats(statistics);
        calculateAverCommentsPerPost();
        calculateAverCommentsPerUser();
        calculateAverPostsPerUser();
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
