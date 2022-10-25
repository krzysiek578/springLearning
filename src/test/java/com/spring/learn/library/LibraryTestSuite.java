package com.spring.learn.library;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuite {
    @Test
    public void testLoadData() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn");
        Library library = context.getBean(Library.class);
        //When
        library.loadDateFromDB();
        //Then
        //do nothing
    }

    @Test
    public void testSaveData() {
        //Give
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn");
        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //do nothing
    }
}
