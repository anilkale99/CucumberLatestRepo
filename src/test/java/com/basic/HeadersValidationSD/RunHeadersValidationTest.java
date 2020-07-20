package com.basic.HeadersValidationSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/HeadersValidationFF/"},
		glue={"com/basic/HeadersValidationSD/"},
		monochrome=true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report271.json"
		}

		
		)

public class RunHeadersValidationTest {

}
