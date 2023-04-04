package com.PhpTravels.modules;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dummy1 extends DriverSetUp {
	
	private DriverSetUp driveSetUp;
	
	public Dummy1(DriverSetUp driveSetUp) {
		super();
		this.driveSetUp = driveSetUp;
	}
	
	
	@Given("launch browser")
	public void launch_browser() {
		driveSetUp.driver.get("https://phptravels.net/");
		log.info("in given");
	}
	@When("condition1")
	public void condition1() {

		//System.out.println("in when");
		log.info("in when");
	}
	@Then("condition2")
	public void condition2() {
		//System.out.println("in then");
		log.info("in then");
	}
}
