package klikmy.repo.klikmylink.service;

import klikmy.repo.klikmylink.model.Category;
import klikmy.repo.klikmylink.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private  CategoryRepository categoryRepository;

    public Category addCategory(Category ca) {
        return categoryRepository.save(ca);
    }
}
