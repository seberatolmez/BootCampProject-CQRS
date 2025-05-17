package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.update;

import an.awesome.pipelinr.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UpdatedApplicationCommand implements Command<UpdatedApplicationResponse> {

    private int id;
    private String name;
}
