package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create;

import an.awesome.pipelinr.Command;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CreateApplicationCommand implements Command<CreateApplicationResponse> {
    private String name ;
}
