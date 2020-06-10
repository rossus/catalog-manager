package com.rossus.catalogmanager.service;

import com.rossus.catalogmanager.client.model.GetCategoryResponse;
import com.rossus.catalogmanager.entity.Category;
import com.rossus.catalogmanager.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public ResponseEntity<List<GetCategoryResponse>> getAllCategories() {
//
        List<Category> categories = categoryRepository.findAll();
        List<GetCategoryResponse> responseObject = new ArrayList<>();

        for (Category category : categories) {
            GetCategoryResponse r = new GetCategoryResponse();
            r.setName(category.getName());
            responseObject.add(r);
        }
//
//        return new ResponseEntity<List<GetCategoryResponse>>(HttpStatus.OK);
        return new ResponseEntity<>(responseObject, HttpStatus.OK);
    }

}
