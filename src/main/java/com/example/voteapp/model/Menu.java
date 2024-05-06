package com.example.voteapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="menus")
public class Menu {

    @Id
    @Column(name = "menu_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long menuId;

    @OneToMany(mappedBy = "menu")
    private List<Dish> dishes;
}
