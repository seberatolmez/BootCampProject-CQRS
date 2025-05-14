package com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampRepository extends JpaRepository<Bootcamp,Integer> {
}
