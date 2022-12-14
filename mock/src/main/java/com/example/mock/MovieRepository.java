package com.example.mock;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {

    HashMap<String, Movies> moviecollection = new HashMap<>() ;

    public void addMovie(Movies movie){
        moviecollection.put(movie.getName(), movie) ;
    }
    public Movies getMovie(String name){
        return moviecollection.get(name);
    }
    
}
