package com.basic.MyFirstSelenium;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/MyFirstSelenium/FirstSeleniumScriptFF2.feature",
				"src/test/resources/com/basic/MyFirstSelenium/FirstSeleniumScriptFF.feature"},
		glue={"com/basic/MyFirstSelenium/"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report51131.json"
		}

		
		)

public class RunnerFirstSeleniumScriptTest {

}
