package com.example.charactercreation.response;

import com.example.charactercreation.entity.Character;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterResponse {

private long id;
private String first_Name;

private String last_Name;
private String NickName;
private int age;
private String Birthday;
private String Gender;
private String primaryPersonalityTrait;
private String primaryAccessory;
private String height;
private String weight;
private String eyeColor;
private String hairColor;
private String skinColor;
private String residence;
private String ethnicity;
private String occupation;
private Boolean fav;

public CharacterResponse(Character character){
    id = character.getId();
    first_Name = character.getFirstName();
   last_Name = character.getLastName();
   NickName = character.getNickName();
   Birthday = character.getBirthday();
   age = character.getAge();
   Gender = getGender();
   primaryPersonalityTrait = character.getPrimaryPersonalityTrait();
   primaryAccessory = character.getPrimaryAccessory();
   height = character.getHeight();
   weight = character.getWeight();
   eyeColor = character.getEyeColor();
   hairColor = character.getHairColor();
   skinColor = character.getSkinColor();
   residence = character.getResidence();
   ethnicity = character.getEthnicity();
   occupation = character.getOccupation();
   fav = character.getFav();
}

}
