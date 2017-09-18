package com.mateusz.recipes.commands;

import com.mateusz.recipes.model.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {

    private Long id;
    private String directions;
    private String description;
    private String url;
    private Integer servings;
    private Integer cookTime;
    private NotesCommand notes;
    private Difficulty difficulty;
    private Integer prepTime;
    private String source;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Set<CategoryCommand> categories = new HashSet<>();

}// class
