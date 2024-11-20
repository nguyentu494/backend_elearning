/*
 * @ (#) CategoryController.java   1.0     19/11/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package vn.edu.iuh.fit.appelearingbe.resources;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 19/11/2024
 * @version: 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.appelearingbe.models.Category;
import vn.edu.iuh.fit.appelearingbe.models.Teacher;
import vn.edu.iuh.fit.appelearingbe.repositories.CategoryRepository;
import vn.edu.iuh.fit.appelearingbe.repositories.TeacherRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        System.out.println(categoryRepository.findAll());
        return ResponseEntity.ok(categoryRepository.findAll());
    }
}
