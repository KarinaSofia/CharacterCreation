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
    private long S_Id;

    @Column
    private String S_Name;

    @Column
    private String S_Genre;

    @Column
    private String S_Desc;
}
