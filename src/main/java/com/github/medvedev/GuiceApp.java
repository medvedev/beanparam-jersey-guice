package com.github.medvedev;

import com.google.inject.AbstractModule;
import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class GuiceApp extends Application<Configuration> {

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        super.initialize(bootstrap);
        GuiceBundle<Configuration> guice =
                GuiceBundle.newBuilder()
                        .addModule(new AbstractModule() {
                            protected void configure() {

                            }
                        })
                        .setConfigClass(Configuration.class)
                        .enableAutoConfig("com.github.medvedev")
                        .build();
        bootstrap.addBundle(guice);
    }

    public void run(Configuration configuration, Environment environment) throws Exception {

    }

    public static void main(String[] args) throws Exception {
        new GuiceApp().run("server", "src/dist/app.yaml");
    }

}
