package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.delete;

import an.awesome.pipelinr.Command;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create.CreateApplicationResponse;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DeletedApplicationCommand implements Command<DeletedApplicationResponse> {
    private int id;
}
