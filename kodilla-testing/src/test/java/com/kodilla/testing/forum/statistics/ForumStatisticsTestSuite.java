package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;
    private static Statistics statisticsMock;
    private static ForumStatistics forumStatistics;

    private ArrayList<String> addUsers(int a) {
        ArrayList<String> userList = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            userList.add("a" + i);
        }
        return userList;
    }

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
        System.out.println("Preparing to execute test #" + testCounter);
    }

    // posts = 0, users = 1000, comments = 100,

    @Test
    public void testCalculateAdvStatisticsPostsZero() {

        //Given
        when(statisticsMock.usersNames()).thenReturn(addUsers(1000));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfUsers());
        assertEquals(100, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverPostsPerUser(), 0.0001);
        assertEquals(0.1, forumStatistics.getAverCommentsPerUser(),0.0001);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.0001);

    }

    // posts = 1000, users = 1000, comments = 100,

    @Test
    public void testCalculateAdvStatisticsPosts1K() {

        //Given
        when(statisticsMock.usersNames()).thenReturn(addUsers(1000));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfUsers());
        assertEquals(100, forumStatistics.getNumberOfComments());
        assertEquals(1.0, forumStatistics.getAverPostsPerUser(), 0.0001);
        assertEquals(0.1, forumStatistics.getAverCommentsPerUser(),0.0001);
        assertEquals(0.1, forumStatistics.getAverCommentsPerPost(), 0.0001);

    }

    // posts = 1000, users = 1000, comments = 0,

    @Test
    public void testCalculateAdvStatisticsCommsZero() {

        //Given
        when(statisticsMock.usersNames()).thenReturn(addUsers(1000));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(1.0, forumStatistics.getAverPostsPerUser(), 0.0001);
        assertEquals(0, forumStatistics.getAverCommentsPerUser(),0.0001);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.0001);

    }

    // comms = 100 < posts = 1000, users = 1000

    @Test
    public void testCalculateAdvStatisticsCommsMoreThanPosts() {

        //Given
        when(statisticsMock.usersNames()).thenReturn(addUsers(1000));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfUsers());
        assertEquals(100, forumStatistics.getNumberOfComments());

        assertTrue(forumStatistics.getNumberOfComments()<forumStatistics.getNumberOfPosts());

        assertEquals(1.0, forumStatistics.getAverPostsPerUser(), 0.0001);
        assertEquals(0.1, forumStatistics.getAverCommentsPerUser(),0.0001);
        assertEquals(0.1, forumStatistics.getAverCommentsPerPost(), 0.0001);

    }

    // comms = 1000 > posts = 100, users = 1000

    @Test
    public void testCalculateAdvStatisticsCommsLessThanPosts() {

        //Given
        when(statisticsMock.usersNames()).thenReturn(addUsers(1000));
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfComments());

        assertTrue(forumStatistics.getNumberOfComments()>forumStatistics.getNumberOfPosts());

        assertEquals(0.1, forumStatistics.getAverPostsPerUser(), 0.0001);
        assertEquals(1.0, forumStatistics.getAverCommentsPerUser(),0.0001);
        assertEquals(10.0, forumStatistics.getAverCommentsPerPost(), 0.0001);

    }

    // posts = 0, users = 0, comments = 0,

    @Test
    public void testCalculateAdvStatisticsUsersZero() {

        //Given
        when(statisticsMock.usersNames()).thenReturn(addUsers(0));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverPostsPerUser(), 0.0001);
        assertEquals(0, forumStatistics.getAverCommentsPerUser(),0.0001);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.0001);

    }

    // posts = 500, users = 1000, comments = 50,

    @Test
    public void testCalculateAdvStatisticsUsers1K() {

        //Given
        when(statisticsMock.usersNames()).thenReturn(addUsers(1000));
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(50);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(500, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfUsers());
        assertEquals(50, forumStatistics.getNumberOfComments());
        assertEquals(0.5, forumStatistics.getAverPostsPerUser(), 0.0001);
        assertEquals(0.05, forumStatistics.getAverCommentsPerUser(),0.0001);
        assertEquals(0.1, forumStatistics.getAverCommentsPerPost(), 0.0001);

    }
}
