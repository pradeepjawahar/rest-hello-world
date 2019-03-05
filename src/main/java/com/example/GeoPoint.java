package com.example;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/geo-point")
public class GeoPoint {

    @javax.ws.rs.core.Context
    ServletContext context;

    @GET
    @Path("latitude")
    @Produces(MediaType.TEXT_PLAIN)
    public String latitude() {
        return "latitude" + context;
    }

    @GET
    @Path("longitude")
    @Produces(MediaType.TEXT_PLAIN)
    public String longitude() {
        return "longitude";
    }
}
