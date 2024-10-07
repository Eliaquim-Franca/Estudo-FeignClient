package com.feign.client.aprendizadoFeign.client.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.feign.client.aprendizadoFeign.client.BeerClient;
import com.feign.client.aprendizadoFeign.client.response.BeerResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BeerService {

	private final BeerClient beerClient;
	
	public List<BeerResponse> getRandomBeer(){
		return beerClient.gerRandomBeer();
	}
	
	public List<BeerResponse> getBeerById(Long id){
		return beerClient.getBeerById(id);
	}
}
