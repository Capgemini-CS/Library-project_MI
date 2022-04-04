package com.example.capgemini.library.service;

import com.example.capgemini.library.entity.Book;
import com.example.capgemini.library.entity.dto.BookDTO;
import com.example.capgemini.library.entity.dto.CategoryDTO;
import com.example.capgemini.library.repository.BookRepository;
import com.example.capgemini.library.repository.CategoryRepository;
import com.example.capgemini.library.service.mapper.BookMapper;
import com.example.capgemini.library.service.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public BookService(BookRepository bookRepository, CategoryRepository categoryRepository) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
    }

    public BookDTO addBook(BookDTO bookDTO){
        bookDTO.setCategory(categoryRepository.getById(bookDTO.getIdcategory()));
        Book book = bookRepository.save(BookMapper.toBook(bookDTO));
        return BookMapper.toBookDTO(book);
    }

    public List<BookDTO> getAll(){
        return bookRepository.findAll().stream().map(BookMapper::toBookDTO).collect(Collectors.toList());
    }

    public BookDTO getById(Integer id) {
        return BookMapper.toBookDTO(bookRepository.getById(id));
    }
}
