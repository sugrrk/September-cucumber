package com.ip.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/bearcan.feature"},
                       glue = {"classpath:com/ip/stepdefintion"},
                       dryRun = true,
                       plugin =  {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})


public class WbiRunner {
}
