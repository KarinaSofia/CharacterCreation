package com.example.charactercreation.repository;

import com.example.charactercreation.entity.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository extends CrudRepository<Story, Long> {


}
