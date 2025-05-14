package com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
