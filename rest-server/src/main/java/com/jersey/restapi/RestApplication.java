package com.jersey.restapi;

import org.glassfish.jersey.server.ResourceConfig;

public class RestApplication  extends ResourceConfig{

	public RestApplication()
	{
		register(CrossOriginFilter.class);
	}
	
}
