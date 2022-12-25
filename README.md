# CharacterCreation
Back end

## Project Description:

  This is the backend source code for the Character Creator Tool. It is responsible for editing the data though endpoints. 
We used Springboot API in this application. The most notable changes required for this Backend is the implementation of 
relationships. Stories should have a one-to-many relationship with Characters since one story can have multiple characters 
in it. 

## Design:
  We have six different components to the backend, those being controller, entity, repository, response, request, and service.
The most important of these being the entity and controller. The entity is what was used to define all the different fields
associated with whatever entity was being described. The controller however helps us establish Mapping which in turn sets
up the adding function, delete function, change function and get function . 

*Goal Database Design*
![image](https://user-images.githubusercontent.com/104159293/209453763-b332b1b6-186c-4f5e-9c0a-41d93cf45bdf.png)


## Backend Endpoints
![image](https://user-images.githubusercontent.com/104159293/209453782-a9beb774-948b-40bb-b940-052339f3ce1a.png)
