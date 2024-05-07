package com.example.voteapp.controller;

import com.example.voteapp.dto.FoodPlaceDto;
import com.example.voteapp.service.FoodPlacesService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequiredArgsConstructor
@RequestMapping("/foodPlaces")
public class FoodPlacesController {

    private final FoodPlacesService foodPlacesService;

    @PostMapping("/addFoodPlace")
    public HttpStatus addFoodPlace(@RequestBody FoodPlaceDto dto){
        return foodPlacesService.addFoodPlace(dto);
    }
}
