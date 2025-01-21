package com.carload.javaanimals.controller;

import com.carload.javaanimals.domain.Animal;
import com.carload.javaanimals.services.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/animals")
public class AnimalController {

    public final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAllAnimals() {
        List<Animal> animals = animalService.getAllAnimals();
        return animals;
    }

    @PostMapping
    public void addAnimal(@RequestBody Animal animal) {
        animalService.addAnimal(animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable UUID id) {
        animalService.deleteAnimal(id);
    }

    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable UUID id) {
        return animalService.getAnimalById(id);
    }

    @PutMapping("/{id}")
    public void updateAnimal(@PathVariable UUID id, @RequestBody Animal animal) {
        animalService.updateAnimal(animal);
    }
}
