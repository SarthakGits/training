package com.sks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/get")
public class GetController {

	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/sum")
	private String getSum() {
		String url = "http://localhost:8080/calculation/sum";
		return restTemplate.getForObject(url,String.class);
	}
}
