package com.springframework.spring5recipesapp.repositories;

import com.springframework.spring5recipesapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
