package com.spring.learn.shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
    @Override
    public String getShapeName() {
        return "It is a circle!";
    }
}
