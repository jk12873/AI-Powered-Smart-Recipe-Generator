package com.example.recipegenerator.model;

import java.util.List;

public record RecipeResponse(
        String title,
        List<String> ingredients,
        List<String> instructions,
        int cookingTimeMinutes,
        String difficulty) {
}
