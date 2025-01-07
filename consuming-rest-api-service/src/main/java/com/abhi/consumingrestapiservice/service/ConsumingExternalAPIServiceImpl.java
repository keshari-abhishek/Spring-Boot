package com.abhi.consumingrestapiservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abhi.consumingrestapiservice.model.MovieModel;

@Service
public class ConsumingExternalAPIServiceImpl implements ConsumingExternalAPIService{
	
	@Autowired 
	private RestTemplate restTemplate;
	
	public List<MovieModel> getMovieByCategory(String category){
		ResponseEntity<List<MovieModel>> response=restTemplate.exchange("https://api.sampleapis.com/movies/"+category
				,org.springframework.http.HttpMethod.GET
				,null
				,new ParameterizedTypeReference<List<MovieModel>>() {}
		);
		
		return response.getBody();
	}

}
