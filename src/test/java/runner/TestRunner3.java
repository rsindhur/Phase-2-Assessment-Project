package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Sindhu  R\\eclipse-workspace\\PhaseEnd-Project-Cucumber-Phase2\\src\\test\\java\\features\\starHealth.feature",

glue= {"steps"},

plugin= {"html:target/Cucumberreport.html",

 "pretty",

"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

"timeline:test-output-thread/"                             

})

public class TestRunner3 {

}
