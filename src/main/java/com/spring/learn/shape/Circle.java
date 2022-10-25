package com.spring.learn.shape;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Circle implements Shape{
    @Override
    public String getShapeName() {
        return "It is a circle!";
    }
}
