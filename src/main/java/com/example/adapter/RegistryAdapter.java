package com.example.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RegistryAdapter implements Adapter{

	@SuppressWarnings("unused")
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private RestTemplate restTemplate;

	public Object providerService(){

  		ResponseEntity <Object> sr = (ResponseEntity<Object>) this.restTemplate.exchange(
   				"http://PROVIDER-V1/demo/v0/provider",
                HttpMethod.GET,
                null,
                Object.class);
 		return sr;
	}
}



