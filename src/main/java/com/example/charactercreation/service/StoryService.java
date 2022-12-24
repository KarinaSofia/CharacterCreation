package com.example.charactercreation.service;

import com.example.charactercreation.entity.Story;
import com.example.charactercreation.exception.ResourceNotFound;
import com.example.charactercreation.repository.StoryRepository;
import com.example.charactercreation.request.StoryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {

    @Autowired
    private StoryRepository storyRepository;


    public List<Story> getAllStories(){
        return (List<Story>) storyRepository.findAll();
    }

    public Story addStory(StoryRequest storyRequest){
        Story story = new Story(storyRequest);

        return storyRepository.save(story);
    }

    public Story updateStory(long id, StoryRequest storyRequest){
        storyRepository.findById(id).orElseThrow(()->new ResourceNotFound("teacher id is not found"));
        Story storyToBeUpdated = new Story(storyRequest);
        storyToBeUpdated.setId(id);
        return storyRepository.save(storyToBeUpdated);
    }

    public void deleteStory(long id){
        if(storyRepository.existsById(id)){
            storyRepository.deleteById(id);
        }
        else{
            throw new ResourceNotFound("story id is not found");
        }
    }

}
