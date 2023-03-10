package com.springframework.spring5recipesapp.repositories;

import com.springframework.spring5recipesapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    <Optional>Category findByDescription(String description);
}
