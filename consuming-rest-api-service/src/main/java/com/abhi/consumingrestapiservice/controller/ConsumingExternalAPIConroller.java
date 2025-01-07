package com.abhi.consumingrestapiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.consumingrestapiservice.model.MovieModel;
import com.abhi.consumingrestapiservice.service.ConsumingExternalAPIService;

@RestController
public class ConsumingExternalAPIConroller {
	
	@Autowired
	private ConsumingExternalAPIService consumingExternalAPIService;
	
	@GetMapping("/movies/{category}")
	public List<MovieModel> getMovieByCategory(@PathVariable String category){
		return consumingExternalAPIService.getMovieByCategory(category);
	}

}
