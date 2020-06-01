package com.trainingcenter;

import com.trainingcenter.resources.ProductResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class Servidor extends Application<Configuration> {
    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        environment.jersey().register(new ProductResource());
    }
}
