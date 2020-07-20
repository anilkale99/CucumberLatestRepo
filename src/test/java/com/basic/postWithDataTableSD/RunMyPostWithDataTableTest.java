package com.basic.postWithDataTableSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/basic/postWithDataTableFF/"},
			glue={"com.basic.postWithDataTableSD"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/json-report/cucumber-report223.json"
			}
		)
		

public class RunMyPostWithDataTableTest {


}
