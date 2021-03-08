package com.oop.exam.service;//package com.oop.exam.service;

import com.oop.exam.model.Movie;

import java.util.LinkedList;

public class MovieManager {
    private LinkedList<Movie> movies;
    private String movie;

    public MovieManager() {
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie name){
        movies.add(name);
    }

    public Movie findMovie(String movie){
        return;
    }

}
