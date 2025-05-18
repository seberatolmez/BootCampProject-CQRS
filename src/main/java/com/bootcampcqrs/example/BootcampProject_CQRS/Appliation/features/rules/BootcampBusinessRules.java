package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.rules;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Bootcamp;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.BootcampRepository;

public class BootcampBusinessRules {

    private final BootcampRepository repository;

    public BootcampBusinessRules(BootcampRepository repository) {
        this.repository = repository;
    }

    public void checkIfBootcampNameExists(String name) {
        Bootcamp bootcamp = repository.findByName(name);
        if (!(bootcamp == null)) {
            throw  new RuntimeException("The bootcamp with '" + name + "' already exists");
        }
    }
}
