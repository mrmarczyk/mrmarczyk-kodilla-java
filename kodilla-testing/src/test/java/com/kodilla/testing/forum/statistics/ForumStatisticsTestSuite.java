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

        //When
        calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, getNumberOfPosts());
    }

    // gdy liczba postów = 1000
    // gdy liczba komentarzy = 0
    // gdy liczba komentarzy < liczba postów
    // gdy liczba komentarzy > liczba postów
    // gdy liczba użytkowników = 0
    // gdy liczba użytkowników = 1000


}
