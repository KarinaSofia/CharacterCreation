package com.example.charactercreation.entity;

import com.example.charactercreation.request.CharacterRequest;
import com.example.charactercreation.request.StoryRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="stories")
@Getter
@Setter
@NoArgsConstructor
public class Story {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "desc")
    private String desc;

    public Story(StoryRequest storyRequest){
        name = storyRequest.getName();
        genre = storyRequest.getGenre();
        desc = storyRequest.getDesc();
    }
}
