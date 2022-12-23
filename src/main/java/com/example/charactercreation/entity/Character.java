package com.example.charactercreation.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="characters")
@Getter
@Setter
@NoArgsConstructor
public class Character {

    @Id @GeneratedValue
    private long C_Id;

    @Column(name="C_FirstName", nullable = false)
    private String C_FirstName;


    @Column(name="C_LastName")
    private String C_LastName;

    @Column(name="C_NickName")
    private String C_NickName;

    @Column(name="C_Age")
    private int C_Age;


    @Column(name="C_Gender")
    private String C_Gender;

    @Column(name="C_PrimaryPersonalityTrait")
    private String C_PrimaryPersonalityTrait;

    @Column(name="C_PrimaryAccessory")
    private String C_PrimaryAccessory;

    @Column(name="C_Height")
    private String C_Height;

    @Column(name="C_Weight")
    private String C_Weight;

    @Column(name="C_EyeColor")
    private String C_EyeColor;

    @Column(name="C_HairColor")
    private String C_HairColor;

    @Column(name="C_SkinColor")
    private String C_SkinColor;

    @Column(name="C_Residence")
    private String C_Residence;

    @Column(name="C_Ethnicity")
    private String C_Ethnicity;

    @Column(name="C_Occupation")
    private String C_Occupation;

}
