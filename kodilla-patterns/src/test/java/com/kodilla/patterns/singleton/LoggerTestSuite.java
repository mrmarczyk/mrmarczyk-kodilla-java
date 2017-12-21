package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void logToLog() {
        logger = new Logger();
        logger.log("my last log");
    }

    @Test
    public void getLastLogTest() {
        //Given

        //When
        String lastLog = logger.getLastLog();
        //Then
        Assert.assertEquals("my last log", lastLog);
    }

}
