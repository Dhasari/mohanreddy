package TestRunnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C://automation//CucumberBDD//src//test//resources//Features//OrangeHRM.feature",	glue = "StepDefinations")

public class TestRunner {

}
