package com.spring.learn.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {
    private final List<String> books = new ArrayList<>();
    @Autowired
    private LibraryDbController libraryDbController;

    public Library(){
        //do nothing
    }

//    @Autowired
//    public void setLibraryDbController(LibraryDbController libraryDbController) {
//        this.libraryDbController = libraryDbController;
//    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadDateFromDB() {
        libraryDbController.loadDate();
    }
}
