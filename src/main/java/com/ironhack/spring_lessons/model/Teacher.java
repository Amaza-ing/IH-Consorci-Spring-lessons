package com.ironhack.spring_lessons.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String teacher;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Teacher(String teacher, Address address) {
        this.teacher = teacher;
        this.address = address;
    }
}
