package com.example.apistarwars.client;


import com.example.apistarwars.response.FilmsResponse;
import com.example.apistarwars.response.PeopleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

//qual endpoint que queremos consumir
@ReactiveFeignClient(url = "https://swapi.dev/api/", name = "star-wars")
public interface FeignClient {

    @GetMapping("/people/{id}")
    Mono<PeopleResponse> getPeopleById(@RequestParam (value = "id") String id);

    @GetMapping("/films/{id}")
    Mono<FilmsResponse> getFilmsById(@RequestParam (value = "id") String id);



}
