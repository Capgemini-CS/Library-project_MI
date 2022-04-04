package com.example.capgemini.library.service.mapper;

import com.example.capgemini.library.entity.Category;
import com.example.capgemini.library.entity.dto.CategoryDTO;

public class CategoryMapper {

    public static CategoryDTO ToCategoryDTO(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setIdCategory(category.getIdCategory());
        categoryDTO.setName(category.getName());
        categoryDTO.setBooks(category.getBooks());

        return  categoryDTO;
    }


    public static Category toCategory(CategoryDTO categoryDTO){
        Category category = new Category();

        category.setIdCategory(categoryDTO.getIdCategory());
        category.setName(categoryDTO.getName());
        category.setBooks(categoryDTO.getBooks());

        return category;
    }
}
