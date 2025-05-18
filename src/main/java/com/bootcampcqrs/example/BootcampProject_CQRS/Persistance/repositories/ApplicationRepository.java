package com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
