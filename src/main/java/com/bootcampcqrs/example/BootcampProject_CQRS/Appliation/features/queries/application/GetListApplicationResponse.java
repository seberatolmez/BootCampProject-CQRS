package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.application;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetListApplicationResponse {

    private int id;
    private String name;
}
