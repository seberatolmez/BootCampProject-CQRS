package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create;

import an.awesome.pipelinr.Command;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.mappers.application.ApplicationMapper;
import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Application;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.ApplicationRepository;

public class CreateApplicationCommandHandler implements
        Command.Handler<CreateApplicationCommand,CreateApplicationResponse> {

    private ApplicationRepository repository;

    @Override
    public CreateApplicationResponse handle(CreateApplicationCommand createApplicationCommand) {

        Application application = ApplicationMapper.
                INSTANCE.applicationFromCreateBrandCommand(createApplicationCommand);
        Application createdApplication = repository.save(application);
        return ApplicationMapper.INSTANCE.createdApplicationResponseFromApplication(createdApplication);
    }


}
