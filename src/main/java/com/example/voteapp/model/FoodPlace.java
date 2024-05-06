package com.example.voteapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="food_places")
public class FoodPlace {

    @Id
    @Column(name = "place_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long placeId;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vote_id")
    private Vote vote;
}
