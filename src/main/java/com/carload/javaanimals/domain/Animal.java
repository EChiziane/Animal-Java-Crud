package com.carload.javaanimals.domain;

import jakarta.persistence.*;

import java.io.Serial;
import java.util.UUID;

@Entity
@Table(name = "animals")

public class Animal {
    private static final long serialVersionUID = 1L;

    @Serial
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private int age;
    public String species;
    public int color;
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
