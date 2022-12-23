package com.example.charactercreation.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CharacterRequest {
    @NotBlank
    private long C_Id;
    @NotBlank
    private String C_First_Name;
    private String C_Last_Name;
    private String C_NickName;
    private int C_Age;
    private String C_Gender;
    private String C_PrimaryPersonalityTrait;
    private String C_PrimaryAccessory;
    private String C_Height;
    private String C_Weight;
    private String C_EyeColor;
    private String C_HairColor;
    private String C_SkinColor;
    private String C_Residence;
    private String C_Ethnicity;
    private String C_Occupation;
}
