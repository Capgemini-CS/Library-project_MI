package com.example.capgemini.library.entity.dto;

import com.example.capgemini.library.entity.Book;
import lombok.*;

import java.util.List;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private Integer idCategory;
    private String name;
    private List<Book> books;
}
