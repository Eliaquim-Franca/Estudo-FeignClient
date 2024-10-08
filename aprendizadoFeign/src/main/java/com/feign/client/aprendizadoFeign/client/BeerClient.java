package com.feign.client.aprendizadoFeign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.feign.client.aprendizadoFeign.client.response.BeerResponse;

@FeignClient(name="BeerClient", url = "https://api.punkapi.com/v2/beers")
public interface BeerClient {
	
	@GetMapping(value= "/random")
	List<BeerResponse> gerRandomBeer();
	
	@GetMapping(value="/{id}")
	List<BeerResponse> getBeerById(@PathVariable("id") long id);
}
