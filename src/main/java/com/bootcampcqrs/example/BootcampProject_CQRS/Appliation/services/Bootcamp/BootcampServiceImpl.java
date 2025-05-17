package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.services.Bootcamp;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Bootcamp;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.BootcampRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootcampServiceImpl implements BootcampService {

     private BootcampRepository repository;

    @Override
    public Bootcamp addBootcamp(Bootcamp bootcamp) {
        return repository.save(bootcamp);
    }

    @Override
    public Bootcamp updateBootcamp(Bootcamp bootcamp) {
        Bootcamp foundBootcamp = repository.findById(bootcamp.getId())
                .orElseThrow(()-> new RuntimeException("Bootcamp not found"));

        return repository.save(foundBootcamp);
    }

    @Override
    public void deleteBootcamp(int id) {

    }

    @Override
    public List<Bootcamp> getBootcampByName(String name) {
        return List.of();
    }
}
