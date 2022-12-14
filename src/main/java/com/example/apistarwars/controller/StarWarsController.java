package com.example.apistarwars.controller;


import com.example.apistarwars.client.FeignClient;
import com.example.apistarwars.response.FilmsResponse;
import com.example.apistarwars.response.PeopleResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/reactive-feign")
public class StarWarsController {

    FeignClient feignClient;

    @GetMapping("/person/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<PeopleResponse> findPersonById(@PathVariable String id){
        return feignClient.getPeopleById(id);
    }

    @GetMapping("/movie/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<FilmsResponse> findMovieById(@PathVariable String id){
        return feignClient.getFilmsById(id);
    }


}
