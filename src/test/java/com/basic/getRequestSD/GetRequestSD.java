package com.basic.getRequestSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GetRequestSD {
	
	@Given("when hit weburl")
	public void when_hit_weburl() {
	    System.out.println("in Given");
	    
	}

	@Then("validate get {string} request status")
	public void validate_get_request_status(String string) {
		System.out.println("in Then =");
	}

}
