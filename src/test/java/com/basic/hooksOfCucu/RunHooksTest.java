package com.basic.hooksOfCucu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/json-report/cucumber-report2439.json"
		})

public class RunHooksTest {
	
	


}
