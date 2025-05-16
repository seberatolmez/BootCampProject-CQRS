package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.services.Blacklist;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Blacklist;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.BlacklistRepository;

public class BlacklistServiceImpl implements BlacklistService {

    private final BlacklistRepository repository;

    public BlacklistServiceImpl(BlacklistRepository repository) {
        this.repository = repository;
    }

    @Override
    public Blacklist addBlacklist(Blacklist blacklist) {
        return repository.save(blacklist);
    }

    @Override
    public Blacklist updateBlacklist(Blacklist blacklist) {
        Blacklist foundBlacklist = repository.findById(blacklist.getId())
                .orElseThrow(()-> new RuntimeException("Blacklist not found"));

         return repository.save(foundBlacklist);
    }

    @Override
    public void deleteBlacklist(int id) {
        Blacklist foundBlacklist = repository.findById(id).
                orElseThrow(()-> new RuntimeException("Blacklist not found"));

        repository.delete(foundBlacklist);
    }

    @Override
    public Blacklist getBlacklist(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blacklist not found"));
    }
}
