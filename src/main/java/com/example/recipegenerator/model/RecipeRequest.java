package com.example.recipegenerator.model;

import java.util.List;

public record RecipeRequest(
        String ingredients,
        String cuisine,
        String dietaryRestrictions) {
}
