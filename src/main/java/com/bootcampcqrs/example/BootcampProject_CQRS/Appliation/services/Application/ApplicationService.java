package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.services.Application;


import com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities.Application;
import com.bootcampcqrs.example.BootcampProject_CQRS.Persistance.repositories.ApplicationRepository;

import java.util.List;

public interface ApplicationService {

    Application addApplication(Application application);
    Application updateApplication(Application application);
    void deleteApplication(int id);
    List<Application> getApplications();

}
