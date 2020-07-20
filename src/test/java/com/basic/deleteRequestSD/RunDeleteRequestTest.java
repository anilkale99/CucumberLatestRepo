package com.basic.deleteRequestSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/json-report/cucumber-report17702.json"
			}
		)
		

public class RunDeleteRequestTest {


}
