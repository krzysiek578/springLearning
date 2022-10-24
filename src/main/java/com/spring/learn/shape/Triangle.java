package com.spring.learn.shape;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{
    @Override
    public String getShapeName() {
        return "It is a triangle!";
    }
}

