package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",//hangi senaryolarda smoke
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= ("json:target/cucumber/cucumber.json"))//basit rapor

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
