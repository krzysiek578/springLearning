package com.spring.learn.library;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuite {
    @Test
    public void testLoadData() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn.library");
        Library library = context.getBean(Library.class);
        //When
        library.loadDateFromDB();
        //Then
        //do nothing
    }

    @Test
    public void testSaveData() {
        //Give
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn.library");
        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //do nothing
    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn.library"); //Dlaczego tutaj wpisuj basePackages, a i tak łapie wszystkie pliki configurate
        //When & Then
        System.out.println("++++++++++++++++++++");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
}
