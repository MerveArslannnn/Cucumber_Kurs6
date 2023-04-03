package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression or @SmokeTest",//hangi senaryolarda etiketler varsa onlar çalışır
        //or yerine and yazılırsa hem smoke bende regrassion tag i olanları çalıştırır
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
