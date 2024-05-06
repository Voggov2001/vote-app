package com.example.voteapp.service;

import com.example.voteapp.dto.VoteRqDTO;
import com.example.voteapp.model.FoodPlace;
import com.example.voteapp.model.Vote;
import com.example.voteapp.repository.FoodPlaceRepository;
import com.example.voteapp.repository.VoteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VoteService {

    private final FoodPlaceRepository foodPlaceRepository;
    private final VoteRepository voteRepository;

    @Transactional
    public HttpStatus vote(VoteRqDTO rqDTO){
        Optional<FoodPlace> votedFoodPlace = foodPlaceRepository.findById(rqDTO.getFoodPlaceId());
        if (votedFoodPlace.isPresent()) {
            Vote voteForFoodPlace = votedFoodPlace.get().getVote();
            Long countVotes = voteForFoodPlace.getCountVoices();
            voteForFoodPlace.setCountVoices(++countVotes);
            voteRepository.save(voteForFoodPlace);
            return HttpStatus.OK;
        }
        return HttpStatus.BAD_REQUEST;
    }
}
