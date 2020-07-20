package com.basic.MyGoogleRestAssured;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/MyGoogleRestAssured/"},
		glue={"com.basic.MyGoogleRestAssured"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/json-report/cucumber-report58434.json"
		}

		
		)

public class RunnerTestGoogleStatusCodeTest {

}
