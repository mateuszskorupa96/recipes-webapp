package com.mateusz.recipes.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class IngredientCommand {

    private Long id;
    private BigDecimal amount;
    private String description;
    private UnitOfMeasureCommand uom;


}// class
