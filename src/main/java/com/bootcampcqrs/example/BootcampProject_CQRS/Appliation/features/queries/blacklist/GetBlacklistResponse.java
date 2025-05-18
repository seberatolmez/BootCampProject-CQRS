package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.blacklist;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetBlacklistResponse {

    private int id;
    private String name;
}
