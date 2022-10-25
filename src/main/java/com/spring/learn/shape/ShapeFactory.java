package com.spring.learn.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapeFactory {
    @Bean
    public Square createSquare() {
        return new Square();
    }

    @Bean
    public Shape theChosenShape(){
        Shape shape;
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(3);
        if (random == 0){
            shape = new Triangle();
        } else if (random == 1) {
            shape = new Circle();
        } else {
            shape = new Square();
        }
        return shape;
    }
}
