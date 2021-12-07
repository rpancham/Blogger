package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/blog")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String blog() {
        return "Read all Blogs";
    }




}

