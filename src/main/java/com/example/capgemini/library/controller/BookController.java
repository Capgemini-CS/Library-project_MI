package com.example.capgemini.library.controller;

import com.example.capgemini.library.entity.dto.BookDTO;
import com.example.capgemini.library.entity.dto.CategoryDTO;
import com.example.capgemini.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/")
    public ResponseEntity<BookDTO> postBook(@RequestBody BookDTO bookDTO) {
        return new ResponseEntity<>(bookService.addBook(bookDTO), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<BookDTO>> getBooks(){
        return new ResponseEntity<>(bookService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookByID (@PathVariable Integer id){
        return new ResponseEntity<>(bookService.getById(id),HttpStatus.OK);
    }
}
