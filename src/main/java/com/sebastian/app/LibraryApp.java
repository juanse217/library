package com.sebastian.app;

import com.sebastian.model.Book;
import com.sebastian.service.BookNotFoundException;
import com.sebastian.service.Library;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        
        library.addBook(new Book("El instituto", 3));

        try {
            library.borrowBook("El instituto");
            library.borrowBook("El instituto");
            library.borrowBook("El instituto");
            library.borrowBook("El instituto");
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
