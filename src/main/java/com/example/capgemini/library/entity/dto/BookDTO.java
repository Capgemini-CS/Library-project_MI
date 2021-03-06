package com.example.capgemini.library.entity.dto;

import com.example.capgemini.library.entity.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private Integer idBook;
    private String name;
    private Integer year;
    private String author;
    @JsonIgnore
    private Category category;
    private Integer idcategory;
}
