package com.spring.learn.shape;

public class Square implements Shape{

    @Override
    public String getShapeName() {
        System.out.println("This is a square");
        return "This is a square";
    }
}
