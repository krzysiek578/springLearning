package com.spring.learn.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        Double result = calculator.add(4.5 , 3.2);
        //Then
        Assertions.assertEquals(7.7, result);
    }

    @Test
    public void testSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        Double result = calculator.sub(4.5 , 3.2);
        //Then
        Assertions.assertEquals(1.3, result, 0.001);
    }


    @Test
    public void testMulti() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        Double result = calculator.multi(4.5 , 3.2);
        //Then
        Assertions.assertEquals(14.4, result);
    }


    @Test
    public void testDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.learn");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        Double result = calculator.div(4.5 , 3.2);
        //Then
        Assertions.assertEquals(1.40625, result);
    }

}
