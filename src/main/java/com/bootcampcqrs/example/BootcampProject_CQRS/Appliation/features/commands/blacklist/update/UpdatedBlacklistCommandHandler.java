package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.update;

import an.awesome.pipelinr.Command;

public class UpdatedBlacklistCommandHandler implements Command.Handler<UpdatedBlacklistCommand,UpdatedBlacklistResponse>{

    @Override
    public UpdatedBlacklistResponse handle(UpdatedBlacklistCommand command) {
        return null;
    }
}
