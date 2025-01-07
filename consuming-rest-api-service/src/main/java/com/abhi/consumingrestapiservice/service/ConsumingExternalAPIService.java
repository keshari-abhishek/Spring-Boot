package com.abhi.consumingrestapiservice.service;

import java.util.List;

import com.abhi.consumingrestapiservice.model.MovieModel;

public interface ConsumingExternalAPIService {
	
	public List<MovieModel> getMovieByCategory(String category);

}
