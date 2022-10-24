package com.spring.learn.forum;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ForumUser {
    private final String name;

    public ForumUser() {
        this.name = "John Smith";
    }
}
