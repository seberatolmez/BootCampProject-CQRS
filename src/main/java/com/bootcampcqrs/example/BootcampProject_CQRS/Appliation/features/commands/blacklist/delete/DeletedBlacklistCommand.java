package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.delete;

import an.awesome.pipelinr.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeletedBlacklistCommand implements Command<DeletedBlacklistResponse> {
    private int id;
}
