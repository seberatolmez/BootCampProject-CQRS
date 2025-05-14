package com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlacklistRepository extends JpaRepository<Blacklist, Integer> {
}
