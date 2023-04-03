package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/FeatureFiles/_01_Login.feature"},//buraya feature files ın path i
glue = {"StepDefinitions"})//buraya sadece klasör un adını yazıyoruz
public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
