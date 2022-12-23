package com.example.charactercreation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFound {
    public ResourceNotFound(String message){
        super();
    }
}
