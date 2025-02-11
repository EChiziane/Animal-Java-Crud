package com.carload.javaanimals.repositories;

import com.carload.javaanimals.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface AnimalRepository extends JpaRepository<Animal, UUID> {
}
