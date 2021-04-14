package com.springframework.recipeapp.services;

import com.springframework.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipe();

    Recipe findById(Long l);

    void deleteById(Long idToDelete);
}
