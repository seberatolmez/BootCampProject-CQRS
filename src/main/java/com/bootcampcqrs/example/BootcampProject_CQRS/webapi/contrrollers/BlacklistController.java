package com.bootcampcqrs.example.BootcampProject_CQRS.webapi.contrrollers;

import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.create.CreateBlacklistCommand;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.create.CreateBlacklistResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.delete.DeletedBlacklistCommand;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.delete.DeletedBlacklistResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.update.UpdatedBlacklistCommand;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.commands.blacklist.update.UpdatedBlacklistResponse;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.blacklist.GetBlacklistQuery;
import com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.blacklist.GetBlacklistResponse;
import org.apache.catalina.Pipeline;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blacklists")
public class BlacklistController {

    private final Pipeline pipeline;
    public BlacklistController(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<CreateBlacklistResponse> createBlacklist(@RequestBody CreateBlacklistCommand command) {
        CreateBlacklistResponse response = command.execute(pipeline);
        return ResponseEntity.ok(response);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UpdatedBlacklistResponse> updateBlacklist(@RequestBody UpdatedBlacklistCommand command) {
        UpdatedBlacklistResponse response = command.execute(pipeline);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GetBlacklistResponse> getBlacklistById(@RequestBody GetBlacklistQuery query) {
        GetBlacklistResponse response = query.execute(pipeline);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<DeletedBlacklistResponse> deleteBlacklist(@PathVariable int id ) {
        DeletedBlacklistCommand command = new DeletedBlacklistCommand(id);
        DeletedBlacklistResponse response = command.execute(pipeline);
        return ResponseEntity.ok(response);
    }
}
