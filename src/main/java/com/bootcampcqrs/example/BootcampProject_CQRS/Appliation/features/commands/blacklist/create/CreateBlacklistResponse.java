package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateBlacklistResponse {

    private int id;
    private String name;

}
