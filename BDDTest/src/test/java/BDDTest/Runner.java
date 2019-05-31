package BDDTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Administrator\\eclipse-workspace\\BDDTest\\src\\test\\java\\BDDTest\\TeaTesting.feature", glue = {
		"BDDTest" })
public class Runner {

}
