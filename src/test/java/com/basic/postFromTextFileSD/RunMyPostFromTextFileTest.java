package com.basic.postFromTextFileSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/basic/postFromTextFileFF/"},
			glue={"com/basic/postFromTextFileSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/json-report/cucumber-report5434.json"
			}
		)
		

public class RunMyPostFromTextFileTest {


}
