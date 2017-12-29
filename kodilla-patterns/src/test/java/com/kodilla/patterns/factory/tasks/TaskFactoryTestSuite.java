package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.factory.tasks.TaskFactory.TaskType.*;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(SHOPPING_TASK);
        //Then
        Assert.assertEquals("TaskOne", shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(PAINTING_TASK);
        //Then
        Assert.assertEquals("TaskTwo", paintingTask.getTaskName());
    }

    @Test (expected=IllegalArgumentException.class)
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(DRIVING_TASK);
        //Then
        Assert.assertEquals("TaskThree", drivingTask.getTaskName());
    }
}