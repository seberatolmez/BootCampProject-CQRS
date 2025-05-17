package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.update;

import an.awesome.pipelinr.Command;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.mappers.application.ApplicationMapper;
import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Application;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.ApplicationRepository;

public class UpdatedAppllicationCommandHandler implements Command.Handler<UpdatedApplicationCommand,UpdatedApplicationResponse>{

    private final ApplicationRepository repository;

    public UpdatedAppllicationCommandHandler(ApplicationRepository repository) {
        this.repository = repository;
    }

    @Override
    public UpdatedApplicationResponse handle(UpdatedApplicationCommand updatedApplicationCommand) {

        Application application = repository.findById(updatedApplicationCommand.getId())
                .orElseThrow(() -> new RuntimeException("Application not found"));

        Application updatedApplication = repository.save(application);
        return ApplicationMapper.INSTANCE.updatedApplicationResponseFromApplication(updatedApplication);
    }


}
