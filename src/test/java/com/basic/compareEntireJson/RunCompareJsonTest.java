package com.basic.compareEntireJson;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/json-report/cucumber-report86105.json"
					
			}
		)
		

public class RunCompareJsonTest {


}
