package com.example.charactercreation.entity;


import com.example.charactercreation.request.CharacterRequest;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_Name", nullable = false)
    private String firstName;


    @Column(name="C_LastName")
    private String LastName;

    @Column(name="C_NickName")
    private String NickName;

    @Column(name="C_Age")
    private int Age;

    @Column(name="C_Gender")
    private String Gender;

    @Column(name="C_PrimaryPersonalityTrait")
    private String PrimaryPersonalityTrait;

    @Column(name="C_PrimaryAccessory")
    private String PrimaryAccessory;

    @Column(name="C_Height")
    private String Height;

    @Column(name="C_Weight")
    private String Weight;

    @Column(name="C_EyeColor")
    private String EyeColor;

    @Column(name="C_HairColor")
    private String HairColor;

    @Column(name="C_SkinColor")
    private String SkinColor;

    @Column(name="C_Residence")
    private String Residence;

    @Column(name="C_Ethnicity")
    private String Ethnicity;

    @Column(name="C_Occupation")
    private String Occupation;


    public Character(CharacterRequest characterRequest){
        firstName = characterRequest.getFirst_Name();

        LastName = characterRequest.getLast_Name();
        Age = characterRequest.getAge();
        Gender = characterRequest.getGender();;
        PrimaryPersonalityTrait = characterRequest.getPrimaryPersonalityTrait();
        PrimaryAccessory = characterRequest.getPrimaryAccessory();
        Height = characterRequest.getHeight();
        Weight = characterRequest.getWeight();
        EyeColor = characterRequest.getEyeColor();
        HairColor = characterRequest.getHairColor();
        SkinColor = characterRequest.getSkinColor();
        Residence = characterRequest.getResidence();
        Ethnicity = characterRequest.getEthnicity();
        Occupation = characterRequest.getOccupation();

    }

}


