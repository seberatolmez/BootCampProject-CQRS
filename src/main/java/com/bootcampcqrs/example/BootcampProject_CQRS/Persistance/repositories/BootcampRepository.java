package com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BootcampRepository extends JpaRepository<Bootcamp,Integer> {

    @Query(value = "select b from Bootcamp b where b.name =: name") //JPQL
    Bootcamp findByName(@Param("name") String name);

//    @Query(value = "SELECT * from bootcamps where LOWER(name) = LOWER(:name)",nativeQuery = true) Native Query
//    Bootcamp findByNameByIgnoreCase(String name);


}
