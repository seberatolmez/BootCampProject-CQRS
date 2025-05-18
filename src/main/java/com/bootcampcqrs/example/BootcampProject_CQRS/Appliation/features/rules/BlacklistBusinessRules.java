package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.rules;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Blacklist;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.BlacklistRepository;
import jakarta.persistence.EntityNotFoundException;

public class BlacklistBusinessRules {

    private final BlacklistRepository repository;


    public BlacklistBusinessRules(BlacklistRepository repository) {
        this.repository = repository;
    }

    public void checkIfBlacklistExists(int id) {
        if (repository.findById(id).isEmpty()) {
            throw new EntityNotFoundException("Blacklist with id " + id + " not found");
        }
    }
}
