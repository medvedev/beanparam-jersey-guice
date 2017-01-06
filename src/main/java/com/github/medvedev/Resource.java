package com.github.medvedev;

import javax.inject.Singleton;
import javax.ws.rs.*;

@Singleton
@Path("/")
public class Resource {
    
    @GET
    public String echoBeanParam(@BeanParam DemoParams params) {
        return params.getFoo();
    }
    
    @GET
    @Path("/{foo}")
    public String echoPathParam(@PathParam("foo") String foo) {
        return foo;
    }

    @GET
    @Path("/q")
    public String echoQueryParam(@QueryParam("foo") String foo) {
        return foo;
    }
    
}
