package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.update;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdatedApplicationResponse {

    private int id;
    private String name;
}
