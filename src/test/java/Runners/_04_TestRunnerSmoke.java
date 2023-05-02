package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",//hangi senaryolarda smoke
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= {"html:target/site/cucumber-pretty.html"})//basit rapor

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
