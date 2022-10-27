package com.spring.learn.reader;

public final class Reader {
    private final Book theBook;

    public Reader(Book theBook) {
        this.theBook = theBook;
    }

    public Book getTheBook() {
        return theBook;
    }

    public void read() {
        System.out.println("Reading: " + theBook.getTitle());
    }


}
