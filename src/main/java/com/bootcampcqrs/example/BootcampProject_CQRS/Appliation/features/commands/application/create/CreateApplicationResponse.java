package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateApplicationResponse {

    private String id;
    private String name;

}
