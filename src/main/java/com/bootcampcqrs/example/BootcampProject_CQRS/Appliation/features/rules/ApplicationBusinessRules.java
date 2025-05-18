package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.rules;

import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.ApplicationRepository;

public class ApplicationBusinessRules {

    private final ApplicationRepository repository;

    public ApplicationBusinessRules(ApplicationRepository repository) {
        this.repository = repository;
    }

    public void checkIfApplicationExists(int id) {
        if (!repository.existsById(id)) {
         throw new RuntimeException("Application with id " + id + " does not exist");
        }
    }


}
