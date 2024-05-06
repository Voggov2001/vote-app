package com.example.voteapp.repository;

import com.example.voteapp.model.FoodPlace;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodPlaceRepository extends CrudRepository<FoodPlace, Long> {
}
