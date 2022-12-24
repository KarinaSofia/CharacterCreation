package com.example.charactercreation.controller;

import com.example.charactercreation.entity.Character;
import com.example.charactercreation.entity.Story;
import com.example.charactercreation.request.CharacterRequest;
import com.example.charactercreation.request.StoryRequest;
import com.example.charactercreation.response.CharacterResponse;
import com.example.charactercreation.response.StoryResponse;
import com.example.charactercreation.service.StoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/stories")
public class StoryController {

    @Autowired
    StoryService storyService;

    @GetMapping()
    public List<StoryResponse> getAllStories(){
        List<Story> stories = storyService.getAllStories();

        List<StoryResponse> storyResponses = new ArrayList<>();
        stories.forEach(story -> {
            storyResponses.add(new StoryResponse(story));
        });

        return storyResponses;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public StoryResponse addStory(@Valid @RequestBody StoryRequest storyRequest)
    {

        Story savedStory = storyService.addStory(storyRequest);

        return new StoryResponse(savedStory);

    }

    @PutMapping("/{id}")
    public StoryResponse updateStory(@PathVariable long id, @Valid @RequestBody StoryRequest storyRequest){
        Story updatedStory = storyService.updateStory(id,storyRequest);
        return new StoryResponse(updatedStory);

    }


    @DeleteMapping("/{id}")
    public void deleteStory(@PathVariable long id){ storyService.deleteStory(id);
    }


}
