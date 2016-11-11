package com.codingape.buscab.api.dao;


import com.codingape.buscab.api.exception.ReviewNotFoundException;
import com.codingape.buscab.api.model.Bar;
import com.codingape.buscab.api.model.Review;
import jersey.repackaged.com.google.common.collect.Maps;

import java.util.Map;

public class ReviewInMemoryDao implements IReviewDao {

	private Map<String, Map <String, Review>> reviewMap;

	public ReviewInMemoryDao() {
		reviewMap = Maps.newHashMap();
	}

	@Override
	public Map<String, Review> getReviewById(String id) throws ReviewNotFoundException {
		return reviewMap.get(id);
	}

	@Override
	public void addReview(String barId, Review review) {
		Map <String, Review> barEntry = reviewMap.get(barId);
		if (barEntry == null){
			Map newBarEntry = Maps.newHashMap();
			newBarEntry.put(review.getId(), review);
			reviewMap.put(barId, newBarEntry);
		}
		else{
			reviewMap.get(barId).put(review.getId(), review);
		}
	}

	@Override
	public void deleteReview(String barId, String id) {
		reviewMap.get(barId).remove(id);
	}
}
