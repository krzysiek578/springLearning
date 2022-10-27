package com.spring.learn.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//Dlaczego tutaj nie pojawia się błąd skoro są dwa konstruktory a nie ma żadnej konfiguracji? W momencie dodania @Autowirde pojawia się błąd

@Service
public class Library {
    private final List<String> books = new ArrayList<>();

    private LibraryDbController libraryDbController;


    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library(){
        //do nothing
    }


    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadDateFromDB() {
        libraryDbController.loadDate();
    }
}
