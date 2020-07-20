package com.basic.tagsOfcucumberSD;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//tags={"@Important"}, //All scenario executed if this is tag for feature file
		tags={"@Smoke"}, //only tag with @Smoke
		//tags={"@Smoke","@Regression"}, //AND condition
		//tags={"@Smoke,@Regression"} , // OR condiction
		//tags = {"~@Smoke"},  // this will exclude the scenario with @SmokeTest
		monochrome=true,
		dryRun=true,
		features= {"src/test/resources/com/basic/tagsOfcucumberFF/"},
		glue={"com/basic/tagsOfcucumberSD/"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/json-report/cucumber-report11121.json"
		}

		
		)

public class RunnerGETRequestTest {

}
