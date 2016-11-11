package com.codingape.buscab.api.repository;

import com.codingape.buscab.api.dao.IReviewDao;
import com.codingape.buscab.api.dao.ReviewInMemoryDao;
import com.codingape.buscab.api.exception.ReviewNotFoundException;
import com.codingape.buscab.api.model.Review;

import java.util.Map;

public class ReviewRepository {

    private IReviewDao userDao;

    public ReviewRepository(){
        userDao =  new ReviewInMemoryDao();
    }

    public Map<String, Review> getReviews (String id) throws ReviewNotFoundException {
        return userDao.getReviewById(id);
    }

    public void addReview(Review user, String barId){
        userDao.addReview(barId, user);
    }

    public void deleteReview(String barId, String id){
        userDao.deleteReview(barId, id);
    }

}
