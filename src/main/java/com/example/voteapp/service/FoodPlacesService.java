package com.example.voteapp.service;

import com.example.voteapp.dto.FoodPlaceDto;
import com.example.voteapp.mapper.FoodPlaceMapper;
import com.example.voteapp.repository.FoodPlaceRepository;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class FoodPlacesService {

    private final FoodPlaceRepository foodPlaceRepository;
    private FoodPlaceMapper foodPlaceMapper;

    @Transactional
    public HttpStatus addFoodPlace(FoodPlaceDto dto) {
        foodPlaceMapper = new FoodPlaceMapper();
        if (foodPlaceRepository.save(foodPlaceMapper.toFoodPlace(dto)) != null) {
            return HttpStatus.OK;
        }
        return HttpStatus.BAD_REQUEST;
    }
}
