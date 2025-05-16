package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.services.Application;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Application;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.ApplicationRepository;

import java.util.List;

public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository repository;

    public ApplicationServiceImpl(ApplicationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Application addApplication(Application application) {
       return repository.save(application);
    }

    @Override
    public Application updateApplication(Application application) {
        Application currentApplication = repository.findById(application.getId())
                .orElseThrow(() -> new RuntimeException("Application not found"));

        return repository.save(application);

    }

    @Override
    public void deleteApplication(int id) {
        Application application = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));

        repository.delete(application);
    }

    @Override
    public List<Application> getApplications() {
        return repository.findAll();
    }
}
