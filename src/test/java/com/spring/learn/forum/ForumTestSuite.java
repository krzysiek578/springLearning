package com.spring.learn.forum;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumTestSuite {
    @Test
    public void testUsername() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //Then
        String name = forumUser.getName();
        //When
        Assert.assertEquals("John Smith", name);
    }



}
