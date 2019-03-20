package com.kuoncat.oauth2.authorizationcode.resourceserver.controller;

import com.kuoncat.oauth2.authorizationcode.resourceserver.entity.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @GetMapping("list")
    public List<Category> categories() {
        List<Category> categories = new ArrayList<>();
        categories.add(Category.builder().id(1).name("科学").build());
        categories.add(Category.builder().id(2).name("人文").build());
        categories.add(Category.builder().id(2).name("动物").build());
        return categories;
    }

}
