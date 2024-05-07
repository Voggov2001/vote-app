package com.example.voteapp.mapper;

import com.example.voteapp.dto.FoodPlaceDto;
import com.example.voteapp.model.FoodPlace;
import com.example.voteapp.model.Vote;

public class FoodPlaceMapper {

    public FoodPlace toFoodPlace(FoodPlaceDto dto){
        return FoodPlace.builder()
                .name(dto.getName())
                .vote(new Vote())
                .build();
    }

    public FoodPlaceDto toDto(FoodPlace foodPlace){
        return new FoodPlaceDto(foodPlace.getName());
    }
}
