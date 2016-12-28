package com.github.medvedev;

import javax.ws.rs.QueryParam;

public class DemoParams {

    @QueryParam("foo")
    private String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
    
}
