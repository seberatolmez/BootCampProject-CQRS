package com.bootcampcqrs.example.BootcampProject_CQRS.Appliation.features.queries.blacklist;

import an.awesome.pipelinr.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetBlacklistQuery implements Command<GetBlacklistResponse> {

    private int id;
}
