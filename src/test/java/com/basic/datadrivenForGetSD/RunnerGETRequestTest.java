package com.basic.datadrivenForGetSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/datadrivenForGetFF/"},
		glue={"com/basic/datadrivenForGetSD/"},
		monochrome=true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report12311.json"
		}

		
		)

public class RunnerGETRequestTest {

}
