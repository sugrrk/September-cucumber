package com.ip.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/MultiGiven.feature"},
                 glue = {"classpath:com/ip/stepdefintion"},
                  plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json"})
public class MulGivenRunner {
}
