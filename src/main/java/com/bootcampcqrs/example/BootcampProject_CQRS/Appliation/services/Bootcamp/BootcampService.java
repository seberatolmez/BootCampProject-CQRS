package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.services.Bootcamp;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Bootcamp;

import java.util.List;

public interface BootcampService {

    Bootcamp addBootcamp(Bootcamp bootcamp);
    Bootcamp updateBootcamp(Bootcamp bootcamp);
    void deleteBootcamp(int id);

    List<Bootcamp> getBootcampByName(String name);
}
