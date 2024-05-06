package com.example.voteapp.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees")
public class Employee {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "second_name")
    private String secondName;
}
