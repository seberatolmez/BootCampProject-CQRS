package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.blacklist;

import an.awesome.pipelinr.Command;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.mappers.blacklist.BlacklistMapper;
import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Blacklist;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.BlacklistRepository;

public class GetBlacklistQueryHandler implements Command.Handler<GetBlacklistQuery,GetBlacklistResponse> {

    private final BlacklistRepository repository;

    public GetBlacklistQueryHandler(BlacklistRepository repository) {
        this.repository = repository;
    }

    @Override
    public GetBlacklistResponse handle(GetBlacklistQuery query) {
        Blacklist blacklist = repository.findById(query.getId()).orElse(null);
        GetBlacklistResponse response = BlacklistMapper.INSTANCE.getListApplicationQuery(blacklist);
        return response;
    }
}
