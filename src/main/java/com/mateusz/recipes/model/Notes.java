package com.mateusz.recipes.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@lombok.Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob // more than 255 chars
    private String recipeNotes;


}// class
