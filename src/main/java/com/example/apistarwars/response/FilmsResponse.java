package com.example.apistarwars.response;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FilmsResponse {

    private List<String> characters;
    private String created;
    private String director;
    private String episode_id;
    private String title;
    private String opening_crawl;


}
