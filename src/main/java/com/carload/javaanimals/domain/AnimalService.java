package com.carload.javaanimals.domain;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {

        this.animalRepository = animalRepository;
    }

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalById(UUID id) {
        return animalRepository.getReferenceById(id);
    }

    public void addAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    public void updateAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    public void deleteAnimal(UUID id) {
        animalRepository.deleteById(id);
    }
}
