package com.example.charactercreation.service;

import com.example.charactercreation.entity.Character;
import com.example.charactercreation.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    @Autowired
    CharacterRepository characterRepository;

    public List<Character> getAllCharacters(){

        return (List<Character>) characterRepository.findAll();

    }
}
