package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.delete;

import an.awesome.pipelinr.Command;

public class DeletedBlacklistCommandHandler implements Command.Handler<DeletedBlacklistCommand,DeletedBlacklistResponse>{


    @Override
    public DeletedBlacklistResponse handle(DeletedBlacklistCommand command) {
        return null;
    }
}
