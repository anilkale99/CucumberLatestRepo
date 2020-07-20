package com.basic.getRequestSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = {"src/test/resources/com/basic/getRequestFF/"},
		glue = {"com.basic.getRequestSD"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/json-report/cucumber-report11121.json"
		}

		)
public class RunRetRequestTest {

}
