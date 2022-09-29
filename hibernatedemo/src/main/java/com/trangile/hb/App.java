package com.trangile.hb;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String uri = "http://localhost:8081/rest-server/rest/employees/emp/60000";
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(uri);
         
        Employee response = target.request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get(Employee.class);
         
        System.out.println(response);
    }
}
