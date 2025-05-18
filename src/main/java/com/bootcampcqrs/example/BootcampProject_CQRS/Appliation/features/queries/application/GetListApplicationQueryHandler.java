package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.application;

import an.awesome.pipelinr.Command;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create.CreateApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.mappers.application.ApplicationMapper;
import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Application;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.ApplicationRepository;

import java.util.List;

public class GetListApplicationQueryHandler implements
        Command.Handler<GetListApplicationQuery, List<GetListApplicationResponse>>{

    private final ApplicationRepository repository;

    public GetListApplicationQueryHandler(ApplicationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<GetListApplicationResponse> handle(GetListApplicationQuery getListApplicationQuery) {
        List<Application> applications = repository.findAll();
        List<GetListApplicationResponse> responses =
                ApplicationMapper.INSTANCE.getListApplicationResponseFromApplication(applications);

        return responses;
    }
}
