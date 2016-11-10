package com.codingape.buscab.api.model;

import jersey.repackaged.com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by rodrigo on 09/11/16.
 */
public class ExtendedBarDetails extends Bar{

    private String latitude;

    private String longitude;

    private Set<Review> reviews;

    private String photoUrl;

    private String extendedDescription;

    public ExtendedBarDetails(String id, String name, String address, String briefDescription, String latitude, String longitude){
        super(id, name, address, briefDescription);
        this.latitude=latitude;
        this.longitude=longitude;
        this.extendedDescription=briefDescription;
        this.photoUrl="";
        this.reviews= Sets.newHashSet();

    }

    public String getLatitude(){
        return latitude;
    }

    public String getLongitude(){
        return longitude;
    }

    public Set getReviews(){
        return reviews;
    }

    public String getPhotoUrl(){
        return photoUrl;
    }

    public String getExtendedDescription(){
        return extendedDescription;
    }
}
