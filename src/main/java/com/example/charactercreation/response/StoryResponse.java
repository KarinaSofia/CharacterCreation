package com.example.charactercreation.response;

import com.example.charactercreation.entity.Story;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StoryResponse {

    private long id;
    private String name;
    private String genre;
    private String desc;

    public StoryResponse(Story story){
        id = story.getId();
        name = story.getName();
        genre = story.getGenre();
        desc = story.getDesc();
    }

}
