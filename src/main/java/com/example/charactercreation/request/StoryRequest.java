package com.example.charactercreation.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoryRequest {
    @NotBlank
    private long id;
    private String name;
    private String genre;
    private String desc;
}
