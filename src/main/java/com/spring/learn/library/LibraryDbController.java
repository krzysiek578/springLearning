package com.spring.learn.library;

import org.springframework.stereotype.Repository;

@Repository
public class LibraryDbController {
    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadDate() {
        System.out.println("Loading date from the database");
    }

}
