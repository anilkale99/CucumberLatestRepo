package com.basic.postStringJsonSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report774.json"
		}
		
		)
		

public class RunMyPostFromTextFileTest {


}
