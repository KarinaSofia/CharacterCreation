package com.example.charactercreation.response;

import com.example.charactercreation.entity.Character;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterResponse {

private long C_Id;
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

public CharacterResponse(Character character){
    C_Id = character.getC_Id();
    C_First_Name = character.getC_FirstName();
    C_Last_Name = character.getC_LastName();
    C_NickName = character.getC_NickName();
    C_Age = character.getC_Age();
    C_Gender = getC_Gender();
    C_PrimaryPersonalityTrait = character.getC_PrimaryPersonalityTrait();
    C_PrimaryAccessory = character.getC_PrimaryAccessory();
    C_Height = character.getC_Height();
    C_Weight = character.getC_Weight();
    C_EyeColor = character.getC_EyeColor();
    C_HairColor = character.getC_HairColor();
    C_SkinColor = character.getC_SkinColor();
    C_Residence = character.getC_Residence();
    C_Ethnicity = character.getC_Ethnicity();
    C_Occupation = character.getC_Occupation();
}

}
