package com.spring.learn.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public void displayValue(double value) {
        System.out.println("Value is" + value);
    }
}
