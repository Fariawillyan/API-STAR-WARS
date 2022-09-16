package com.example.apistarwars.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PeopleResponse {

    private String name;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> films;


}
