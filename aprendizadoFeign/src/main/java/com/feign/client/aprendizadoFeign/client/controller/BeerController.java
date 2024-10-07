package com.feign.client.aprendizadoFeign.client.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.client.aprendizadoFeign.client.response.BeerResponse;
import com.feign.client.aprendizadoFeign.client.service.BeerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/beer")
public class BeerController {
	
	private final BeerService beerService;
	
	@GetMapping("/{id}")
	public List<BeerResponse> searchById(@PathVariable Long id){return beerService.getBeerById(id);}
	
	@GetMapping("")
	public List<BeerResponse> getRandomBeer(){return beerService.getRandomBeer();}
	
}
