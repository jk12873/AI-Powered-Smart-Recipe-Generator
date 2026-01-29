package com.example.recipegenerator.controller;

import com.example.recipegenerator.model.RecipeRequest;
import com.example.recipegenerator.model.RecipeResponse;
import com.example.recipegenerator.service.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("/generate")
    public RecipeResponse generateRecipe(@RequestBody RecipeRequest request) {
        return recipeService.generateRecipe(request);
    }
}
