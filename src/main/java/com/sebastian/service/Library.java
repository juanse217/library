package com.sebastian.service;

import java.util.ArrayList;
import java.util.List;

import com.sebastian.model.Book;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void borrowBook(String title) throws BookNotFoundException{
        Book book = findBook(title);
        if(book == null){
            throw new BookNotFoundException("The book doesnt exsist ");
        }else{
            book.borrow();
            System.out.println("Your book could be lent");
        }
        
    }

    private Book findBook(String title){
        for (Book book : books) {
            if(book.getName().equals(title)){
                return book; 
            }
        }

        return null;
    }
    
}
