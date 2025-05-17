package com.bootcampcqrs.example.BootcampProject_CQRS.webapi.contrrollers;


import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create.CreateApplicationCommand;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.create.CreateApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.delete.DeletedApplicationCommand;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.delete.DeletedApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.update.UpdatedApplicationCommand;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.application.update.UpdatedApplicationResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.application.GetListApplicationQuery;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.application.GetListApplicationResponse;
import org.apache.catalina.Pipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

      private final Pipeline pipeline;

    public ApplicationController(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CreateApplicationResponse> addApplications(@RequestBody CreateApplicationCommand command){

        CreateApplicationResponse response = command.execute(pipeline);
        return ResponseEntity.ok(response);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UpdatedApplicationResponse> updateApplications(@RequestBody UpdatedApplicationCommand command){
        UpdatedApplicationResponse response = command.execute(pipeline);
        return ResponseEntity.ok(response);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<DeletedApplicationResponse> deleteApplications(@PathVariable int id){
        DeletedApplicationCommand command = new DeletedApplicationCommand(id);
        DeletedApplicationResponse response = command.execute(pipeline);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<GetListApplicationResponse>> getApplications() {
        GetListApplicationQuery query = new GetListApplicationQuery();
        List<GetListApplicationResponse> responses = query.execute(pipeline);
        return ResponseEntity.ok(responses);
    }
}
