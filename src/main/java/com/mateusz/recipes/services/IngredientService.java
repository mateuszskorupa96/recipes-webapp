package com.mateusz.recipes.services;

import com.mateusz.recipes.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndId(Long recipeId, Long id);
}
