package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create;

import an.awesome.pipelinr.Command;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.ApplicationRepository;

public class CreateApplicationCommandHandler implements
        Command.Handler<CreateApplicationCommand,CreateApplicationResponse> {

    private ApplicationRepository repository;

    @Override
    public CreateApplicationResponse handle(CreateApplicationCommand createApplicationCommand) {
        return null;
    }

    @Override
    public boolean matches(CreateApplicationCommand command) {
        return Command.Handler.super.matches(command);
    }
}
