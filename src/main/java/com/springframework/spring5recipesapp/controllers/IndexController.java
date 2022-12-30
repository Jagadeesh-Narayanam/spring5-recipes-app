package com.springframework.spring5recipesapp.controllers;

import com.springframework.spring5recipesapp.domain.Category;
import com.springframework.spring5recipesapp.domain.UnitOfMeasure;
import com.springframework.spring5recipesapp.repositories.CategoryRepository;
import com.springframework.spring5recipesapp.repositories.UnitOfMeasureRepository;
import com.springframework.spring5recipesapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndex(Model model){
        log.debug("Getting Index page");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
