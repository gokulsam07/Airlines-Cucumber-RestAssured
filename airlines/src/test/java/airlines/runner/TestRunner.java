package airlines.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/featurefiles",
glue={"airlines.stepdefinitions"}
,plugin= {"pretty","html:report.html"}
,publish=true
,monochrome=false)
public class TestRunner extends AbstractTestNGCucumberTests {

}
