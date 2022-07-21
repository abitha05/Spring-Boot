package com.SpringBoot.SpringProgram.springjspwar.exception;

import com.SpringBoot.SpringProgram.springjspwar.dto.Book;
import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {
    private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }
}
