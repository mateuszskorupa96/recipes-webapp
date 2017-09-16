package com.mateusz.recipes.services;

import com.mateusz.recipes.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
