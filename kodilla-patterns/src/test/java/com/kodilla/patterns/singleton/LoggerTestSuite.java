package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest() {
        //Given

        //When
        Logger.getInstance().log("my last log");

        //Then
        Assert.assertEquals("my last log", Logger.getInstance().getLastLog() );
    }

}
