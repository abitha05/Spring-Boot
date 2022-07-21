package com.SpringBoot.SpringProgram.springjspwar.service;

import java.util.Collection;

import com.SpringBoot.SpringProgram.springjspwar.dto.Book;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}