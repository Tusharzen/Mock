package com.example.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    MovieRepository repository ;

    @PostMapping("/add_movie")
    public void addMovie(@RequestBody Movies movie){
        repository.addMovie(movie);
    }

    @GetMapping("/get_movie_by_name/{name}")
    public Movies getMovie(@PathVariable String name){
        Movies m = repository.getMovie(name);
        return m ;
    }
    
}

