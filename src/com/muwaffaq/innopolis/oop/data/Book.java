package com.muwaffaq.innopolis.oop.data;

import java.util.List;

public class Book {
    String category;
    String title;
    String author;
    String lang;
    String cover;
    int year;
    double price;
}

class BookStore{
    List<Book> bookList;
}