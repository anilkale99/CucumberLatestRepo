package com.basic.getRequestBasicSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/getRequestBasicFF/"},
		glue	= {"com.basic.getRequestBasicSD"},
		monochrome=true
		
		
		
		)
public class RunnerBasicGetTest {
	
	
			

}
