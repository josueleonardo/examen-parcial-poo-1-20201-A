package com.oop.exam.model;

import java.util.ArrayList;

public class Review {
    private User user;
    private MovieScore score;
    private String review;

    public Review(User user, MovieScore score, String review){
        this.user = user;
        this.score = score;
        this.review = review;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MovieScore getScore() {
        return score;
    }

    public void setScore(MovieScore score) {
        this.score = score;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
