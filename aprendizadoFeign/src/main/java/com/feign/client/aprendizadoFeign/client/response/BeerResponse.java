package com.feign.client.aprendizadoFeign.client.response;

import lombok.Data;

@Data
public class BeerResponse {
	private Long id;
	private String name;
	private String description;
	private Long abv;
	private Long ibu;
}
