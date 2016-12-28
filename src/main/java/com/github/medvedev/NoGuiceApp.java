package com.github.medvedev;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class NoGuiceApp extends Application<Configuration> {
    public void run(Configuration configuration, Environment environment) throws Exception {
        environment.jersey().register(Resource.class);
    }

    public static void main(String[] args) throws Exception {
        new NoGuiceApp().run("server", "src/dist/app.yaml");
    }
    
}
