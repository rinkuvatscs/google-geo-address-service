package com.geo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestServiceCaller {
	
	
	
	@Autowired
	RestTemplate restTemplate ;
	
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	/*public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}*/
	
	
	
	
}
