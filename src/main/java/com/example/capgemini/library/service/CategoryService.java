package com.example.capgemini.library.service;

import com.example.capgemini.library.entity.Category;
import com.example.capgemini.library.entity.dto.CategoryDTO;
import com.example.capgemini.library.repository.CategoryRepository;
import com.example.capgemini.library.service.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryDTO addCategory(CategoryDTO categoryDTO) {
        Category category = categoryRepository.save(CategoryMapper.toCategory(categoryDTO));
        return CategoryMapper.ToCategoryDTO(category);
    }

    public CategoryDTO getById(Integer id) {
        return CategoryMapper.ToCategoryDTO(categoryRepository.getById(id));
    }
}
