package com.mavenit.selenium;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource",
        dryRun = false,
        strict = false,
        plugin = {"json:target/cucumber.json"}
)

public class RunCukesTest {
}
