package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testToDoListTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("some task to do");

        //Then
        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertEquals("some task to do", board.getToDoList().getTasks().get(0));

    }

    @Test
    public void testInProgressListTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getInProgressList().addTask("some task in progress");

        //Then
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertEquals("some task in progress", board.getInProgressList().getTasks().get(0));

    }

    @Test
    public void testDoneListTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().addTask("some task done");

        //Then
        Assert.assertEquals(1, board.getDoneList().getTasks().size());
        Assert.assertEquals("some task done", board.getDoneList().getTasks().get(0));
    }
}