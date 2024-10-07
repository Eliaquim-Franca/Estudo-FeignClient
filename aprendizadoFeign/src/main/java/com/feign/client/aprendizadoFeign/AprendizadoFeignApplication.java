package com.feign.client.aprendizadoFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AprendizadoFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprendizadoFeignApplication.class, args);
	}

}
