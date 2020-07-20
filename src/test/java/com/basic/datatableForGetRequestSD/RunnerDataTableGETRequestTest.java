package com.basic.datatableForGetRequestSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/datatableForGetRequestFF/"},
		glue={"com.basic.datatableForGetRequestSD"},
		monochrome = true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/json-report/cucumber-report1141.json"
		}
		)

public class RunnerDataTableGETRequestTest {

}
