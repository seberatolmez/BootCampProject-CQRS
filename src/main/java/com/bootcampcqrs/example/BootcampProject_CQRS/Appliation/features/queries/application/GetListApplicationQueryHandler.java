package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.application;

import an.awesome.pipelinr.Command;
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

    }
}
