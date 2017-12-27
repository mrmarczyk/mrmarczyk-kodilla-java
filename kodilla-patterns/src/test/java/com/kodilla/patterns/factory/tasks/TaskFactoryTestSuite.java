package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("TaskOne", shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("TaskTwo", paintingTask.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("TaskThree", drivingTask.getTaskName());
    }

    /*
    @Test
    public void testFactoryDefault() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task  = factory.makeTask(TaskFactory.default);
        //Then
        Assert.assertEquals("TaskThree", writingTask.getTaskName());

    } */
}
