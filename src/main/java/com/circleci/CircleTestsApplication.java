package com.circleci;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CircleTestsApplication extends Application<CircleTestsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new CircleTestsApplication().run(args);
    }

    @Override
    public String getName() {
        return "CircleTests";
    }

    @Override
    public void initialize(final Bootstrap<CircleTestsConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final CircleTestsConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
