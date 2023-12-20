package Datix_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src/test/java/featurefiles", 
glue = {"Datix_Smoketest"},
monochrome = false,
dryRun = false,
plugin = { "pretty", "html:C:/Users/SaiKiran/test.xml"},
publish = true)
public class RunTest {	
}
