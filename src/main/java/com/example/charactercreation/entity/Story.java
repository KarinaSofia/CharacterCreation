package com.example.charactercreation.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stoires")
@Getter
@Setter
@NoArgsConstructor
public class Story {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String genre;

    @Column
    private String desc;
}
