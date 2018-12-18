package com.firstPackage.secondPackage;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@Path("/Hi")
public class RestApi {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloAPI(){
        return "API IS WORKING!";
    }
}
