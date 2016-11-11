package com.codingape.buscab.api.services;


import com.codingape.buscab.api.exception.ReviewNotFoundException;
import com.codingape.buscab.api.model.Review;
import com.codingape.buscab.api.repository.ReviewRepository;

import java.util.Map;

public class ReviewService {

	private static ReviewService instance =null;

	private ReviewRepository repository = null;

	private ReviewService(){
		repository = new ReviewRepository();
	}
	
	public static ReviewService getInstance(){
		if (instance == null){
			instance= new ReviewService();
		}
		return instance;
	}
	
	public Map<String, Review> getReview(String id) throws ReviewNotFoundException {
		return repository.getReviews(id);
	}
	
	public void addReview(String barId, Review review){
		repository.addReview(review, barId);
	}
	
	public void deleteReview(String barId, String id){
		repository.deleteReview(barId, id);
	}

}
