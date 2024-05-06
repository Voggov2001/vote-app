package com.example.voteapp.controller;

import com.example.voteapp.dto.VoteRqDTO;
import com.example.voteapp.service.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VoteController {

    private final VoteService voteService;

    @PostMapping("/vote")
    public HttpStatus vote(@RequestBody VoteRqDTO rqDTO) {
        return voteService.vote(rqDTO);
    }
}
