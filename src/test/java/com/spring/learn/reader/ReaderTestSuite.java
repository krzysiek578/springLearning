package com.spring.learn.reader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class ReaderTestSuite {
    @Test
    public void testReader() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);
        // When & Then
        reader.read();
    }

    @Test
    public void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        //When
        Boolean book2Exist = context.containsBean("book2");
        //Then
        Assertions.assertEquals(true, book2Exist);
    }
}
