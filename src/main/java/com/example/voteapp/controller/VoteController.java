package com.example.voteapp.controller;

import com.example.voteapp.service.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VoteController {

    private final VoteService voteService;

    @PostMapping("/vote")
    public void vote(){
        voteService.vote();
    }
}
