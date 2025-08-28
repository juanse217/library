package com.sebastian.model;

public class Book {
    private String name;
    private int quantity;

    public Book(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    } 

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void borrow(){
        if(quantity <= 0){
            throw new BookNotAvailableException("We have no copies of " + name);
        }else{
            quantity--;
            System.out.println("Enjoy your book");
        }
    }
    
}
