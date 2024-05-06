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
@Table(name="votes")
public class Vote {

    @Id
    @Column(name = "vote_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long voteId;

    @Column(name = "count_voices")
    private Long countVoices;

    @OneToOne(mappedBy = "vote")
    private FoodPlace foodPlace;
}
