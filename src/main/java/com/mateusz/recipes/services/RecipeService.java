package com.mateusz.recipes.services;

import com.mateusz.recipes.commands.RecipeCommand;
import com.mateusz.recipes.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
    RecipeCommand findCommandById(Long l);
    void deleteById(Long idToDelete);

}
