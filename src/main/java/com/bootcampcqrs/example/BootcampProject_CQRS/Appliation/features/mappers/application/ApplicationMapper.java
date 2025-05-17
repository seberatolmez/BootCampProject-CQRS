package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.mappers.application;


import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create.CreateApplicationCommand;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create.CreateApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.delete.DeletedApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.update.UpdatedApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.application.GetListApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Application;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface ApplicationMapper {

    ApplicationMapper INSTANCE = Mappers.getMapper(ApplicationMapper.class);

    Application applicationFromCreateBrandCommand(CreateApplicationCommand command);
    CreateApplicationResponse createdApplicationResponseFromApplication(Application application);
    UpdatedApplicationResponse updatedApplicationResponseFromApplication(Application application);
    DeletedApplicationResponse deletedApplicationResponseFromApplication(Application application);
    GetListApplicationResponse getListApplicationResponseFromApplication(Application application);

    default List<GetListApplicationResponse> getListApplicationResponseFromApplication(List<Application> applications) {
        return  applications.stream()
                .map(this::getListApplicationResponseFromApplication).collect(Collectors.toList());
    }


}
