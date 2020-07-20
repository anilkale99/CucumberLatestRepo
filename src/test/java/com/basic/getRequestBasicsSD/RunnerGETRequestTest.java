package com.basic.getRequestBasicsSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/getRequestBasicsFF/"},
		glue={"com/basic/getRequestBasicsSD/"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report22711.json"
		}

		
		)

public class RunnerGETRequestTest {

}
