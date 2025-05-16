package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.services.Blacklist;

import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Blacklist;

public interface BlacklistService {

    Blacklist addBlacklist(Blacklist blacklist);
    Blacklist updateBlacklist(Blacklist blacklist);
    void deleteBlacklist(int id);
    Blacklist getBlacklist(int id);
}
