package klikmy.repo.klikmylink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import klikmy.repo.klikmylink.model.Category;
import klikmy.repo.klikmylink.service.CategoryService;


@RestController
@RequestMapping("/api/category")
public class CategoryRestController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "")
    public ResponseEntity<Category> addCategory(@RequestBody Category category){
        Category ca = categoryService.addCategory(category);
        return ResponseEntity.ok(ca);
    }
}
