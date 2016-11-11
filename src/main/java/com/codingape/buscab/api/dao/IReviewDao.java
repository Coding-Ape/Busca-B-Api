package com.codingape.buscab.api.dao;

import com.codingape.buscab.api.exception.ReviewNotFoundException;
import com.codingape.buscab.api.model.Review;

import java.util.Map;

/**
 * Created by rodrigo on 10/11/16.
 */
public interface IReviewDao {

    public Map<String, Review> getReviewById(String id) throws ReviewNotFoundException;

    public void addReview(String barId, Review review);

    public void deleteReview(String barId, String id);
}
