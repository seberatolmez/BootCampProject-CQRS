package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.update;

import an.awesome.pipelinr.Command;

public class UpdatedAppllicationCommandHandler implements Command.Handler<UpdatedApplicationCommand,UpdatedApplicationResponse>{
    @Override
    public UpdatedApplicationResponse handle(UpdatedApplicationCommand updatedApplicationCommand) {
        return null;
    }

    @Override
    public boolean matches(UpdatedApplicationCommand command) {
        return Command.Handler.super.matches(command);
    }
}
