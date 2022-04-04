package com.example.capgemini.library.service.mapper;

import com.example.capgemini.library.entity.Book;
import com.example.capgemini.library.entity.dto.BookDTO;

public class BookMapper {

    public static BookDTO toBookDTO (Book book){
        BookDTO bookDTO = new BookDTO();

        bookDTO.setIdBook(book.getIdBook());
        bookDTO.setName(book.getName());
        bookDTO.setYear(book.getYear());
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setCategory(book.getCategory());

        return bookDTO;
    }


    public static Book toBook (BookDTO bookDTO){
        Book book = new Book();

        book.setIdBook(bookDTO.getIdBook());
        book.setName(bookDTO.getName());
        book.setYear(bookDTO.getYear());
        book.setAuthor(bookDTO.getAuthor());
        book.setCategory(bookDTO.getCategory());

        return book;
    }
}
