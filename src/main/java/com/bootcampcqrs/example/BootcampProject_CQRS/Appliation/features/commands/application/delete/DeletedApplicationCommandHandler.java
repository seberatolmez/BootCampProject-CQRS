package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.delete;

import an.awesome.pipelinr.Command;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.mappers.application.ApplicationMapper;
import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Application;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.ApplicationRepository;

public class DeletedApplicationCommandHandler implements Command.Handler<DeletedApplicationCommand,DeletedApplicationResponse>{

    private final ApplicationRepository repository;

    public DeletedApplicationCommandHandler(ApplicationRepository repository) {
        this.repository = repository;
    }

    @Override
    public DeletedApplicationResponse handle(DeletedApplicationCommand deletedApplicationCommand) {
        Application application = repository.findById(deletedApplicationCommand.getId())
                .orElseThrow(()-> new RuntimeException("Application not found"));

        return ApplicationMapper.INSTANCE.deletedApplicationResponseFromApplication(application);
    }

}
