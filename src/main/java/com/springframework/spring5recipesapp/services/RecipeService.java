package com.springframework.spring5recipesapp.services;
import com.springframework.spring5recipesapp.domain.Recipe;
import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
