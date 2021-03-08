package com.oop.exam.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private List<String> actors;
    private List<Review> reviews;
    private String title;
    private int year;
    private String director;
    private List<Platform> platforms;
    private String Synopsis;

    public Movie(String title, int year, String director){
        setTitle(title);
        reviews = new ArrayList<>();
        String actors[] = new String[]{};
        platforms = new ArrayList<>();
        setYear(year);
        setDirector(director);
        setSynopsis(Synopsis);
    }


    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.Synopsis = synopsis;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
