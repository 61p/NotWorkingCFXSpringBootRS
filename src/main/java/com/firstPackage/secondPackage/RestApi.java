package com.firstPackage.secondPackage;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Service
@Path("/hi")
public class RestApi {

    public RestApi(){}

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response.ResponseBuilder helloAPI(){
        return Response.ok("WOWO YEYE");
    }
}
