package com.example.endpoint.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.endpoint.RESTDemoEndpoint;


@ApplicationPath("/demo")
@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(RESTDemoEndpoint.class);
	}

}


