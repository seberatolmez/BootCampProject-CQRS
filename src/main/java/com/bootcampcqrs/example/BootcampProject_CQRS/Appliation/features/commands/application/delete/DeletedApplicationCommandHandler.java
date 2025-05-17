package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.delete;

import an.awesome.pipelinr.Command;

public class DeletedApplicationCommandHandler implements Command.Handler<DeletedApplicationCommand,DeletedApplicationResponse>{
    @Override
    public DeletedApplicationResponse handle(DeletedApplicationCommand deletedApplicationCommand) {
        return null;
    }

    @Override
    public boolean matches(DeletedApplicationCommand command) {
        return Command.Handler.super.matches(command);
    }
}
