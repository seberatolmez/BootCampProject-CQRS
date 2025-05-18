package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.mappers.blacklist;

import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create.CreateApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.delete.DeletedApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.update.UpdatedApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.create.CreateBlacklistCommand;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.create.CreateBlacklistResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.delete.DeletedBlacklistResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.update.UpdatedBlacklistResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.application.GetListApplicationQuery;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.application.GetListApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.blacklist.GetBlacklistResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Blacklist;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BlacklistMapper {

    BlacklistMapper INSTANCE = Mappers.getMapper(BlacklistMapper.class);

    Blacklist blacklistFromCreateBlacklistCommand(CreateBlacklistCommand createBlacklistCommand);

    CreateBlacklistResponse blacklistToCreateApplicationResponse(Blacklist blacklist);
    UpdatedBlacklistResponse blacklistToUpdatedApplicationResponse(Blacklist blacklist);
    DeletedBlacklistResponse blacklistToDeletedApplicationResponse(Blacklist blacklist);
    GetBlacklistResponse getListApplicationQuery(Blacklist blacklist);


}
