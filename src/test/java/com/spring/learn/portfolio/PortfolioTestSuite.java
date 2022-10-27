package com.spring.learn.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class PortfolioTestSuite {
    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList toDoList = (TaskList) context.getBean("toDoList");
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        TaskList doneList = (TaskList) context.getBean("doneList");
        //When
        toDoList.addTask("Learn Spring Boot");
        inProgressList.addTask("Learn bean");
        doneList.addTask("Learned injection dependents");
        //Then
        List<String> expected = new ArrayList<>(List.of(
                "Learn Spring Boot"
        ));
        System.out.println();
        Assertions.assertEquals(expected.toString(), board.getToDoList().toString());
    }
}
