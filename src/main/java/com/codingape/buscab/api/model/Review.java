package com.codingape.buscab.api.model;

/**
 * Created by rodrigo on 09/11/16.
 */
public class Review {

    private String id;

    private User author;

    private Float rating;

    private String description;

    public Review (String id, User author, Float rating, String description){
        this.id = id;
        this.author = author;
        this.rating = rating;
        this.description = description;
    }

    public String getId() { return id;}

    public User getAuthor(){
        return author;
    }

    public Float getRating(){
        return rating;
    }

    public String getDescription(){
        return description;
    }
}
