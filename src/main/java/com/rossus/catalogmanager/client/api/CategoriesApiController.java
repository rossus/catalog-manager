package com.rossus.catalogmanager.client.api;

import com.rossus.catalogmanager.client.model.AddCategoryRequest;
import com.rossus.catalogmanager.client.model.EditCategoryRequest;
import com.rossus.catalogmanager.client.model.GetCategoryResponse;

import com.rossus.catalogmanager.repository.CategoryRepository;
import com.rossus.catalogmanager.service.CategoryService;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-09T19:30:30.590+03:00")

@Controller
public class CategoriesApiController implements CategoriesApi {

//    @Autowired
//    private final CategoryService categoryService;
//
//    public CategoriesApiController(CategoryService categoryService) {
//        this.categoryService = categoryService;
//    }

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoriesApiController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public ResponseEntity<Void> addCategory(@ApiParam(value = "Name of the new category and the name of parent category (optional)" ,required=true )  @Valid @RequestBody AddCategoryRequest body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> editCategory(@ApiParam(value = "Name of the category to edit",required=true ) @PathVariable("category") String category,
        @ApiParam(value = "Category parameters to edit" ,required=true )  @Valid @RequestBody EditCategoryRequest body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<GetCategoryResponse>> getAllCategories() {
        // do some magic!
        return new ResponseEntity<List<GetCategoryResponse>>(HttpStatus.OK);
//        return categoryService.getAllCategories();
    }

    public ResponseEntity<GetCategoryResponse> getCategory(@ApiParam(value = "Name of the category to return",required=true ) @PathVariable("category") String category) {
        // do some magic!
        return new ResponseEntity<GetCategoryResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> removeCategory(@ApiParam(value = "Name of the category to remove",required=true ) @PathVariable("category") String category,
        @ApiParam(value = "Remove contents of the category", defaultValue = "true") @RequestParam(value = "contents", required = false, defaultValue="true") Boolean contents) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
