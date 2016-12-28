package com.github.medvedev;

import javax.inject.Singleton;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

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
    public String echoQueryParam(@PathParam("foo") String foo) {
        return foo;
    }
    
}
