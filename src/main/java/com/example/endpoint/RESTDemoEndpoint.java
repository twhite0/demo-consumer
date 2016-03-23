package com.example.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import com.example.adapter.Adapter;

@Component
@ComponentScan(basePackages="com.example.adapter.config")
@Path("/v0")
public class RESTDemoEndpoint {

	@Autowired
	private Adapter a;

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(RESTDemoEndpoint.class);

	@GET
	@Path("/consumer")
	@Produces(MediaType.APPLICATION_JSON)
	public Object consumer(@Context HttpHeaders httpHeaders) {

		return a.providerService();
		
	}

}



