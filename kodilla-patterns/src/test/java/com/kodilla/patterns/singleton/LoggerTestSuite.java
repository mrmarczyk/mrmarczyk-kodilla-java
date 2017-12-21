package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logToLog() {
        Logger.getInstance().log("my last log");
    }

    @Test
    public void getLastLogTest() {
        //Given

        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("my last log", lastLog);
    }

}
