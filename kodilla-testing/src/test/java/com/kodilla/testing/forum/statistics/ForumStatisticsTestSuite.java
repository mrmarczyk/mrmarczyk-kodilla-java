package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

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
        System.out.println("Preparing to execute test #" + testCounter);
    }


    // gdy liczba postów = 0
    public void testCalculateAdvStatisticsPostsZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerUser(),0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.01);

    }

    /* gdy liczba postów = 1000

    public void testCalculateAdvStatisticsPosts1K() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerUser(),0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.01);

    }

    // gdy liczba komentarzy = 0

    public void testCalculateAdvStatisticsCommsZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getNumberOfPosts());
        assertEquals(100, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerUser(),0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.01);

    }

    // gdy liczba komentarzy < liczba postów

    public void testCalculateAdvStatisticsPostsMore() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerUser(),0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.01);

    }

    // gdy liczba komentarzy > liczba postów

    public void testCalculateAdvStatisticsCommsMore() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerUser(),0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.01);

    }

    // gdy liczba użytkowników = 0

    public void testCalculateAdvStatisticsUsersZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerUser(),0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.01);

    }

    // gdy liczba użytkowników = 1000

    public void testCalculateAdvStatisticsUsers1K() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerUser(),0.01);
        assertEquals(0, forumStatistics.getAverCommentsPerPost(), 0.01);

    } */


}
