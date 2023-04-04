package com.PhpTravels.Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src\\test\\resources\\features\\dummy.feature",
		glue = {"classpath:com.PhpTravels.modules"},
		plugin = { "pretty", "html:target/cucumber-reports.html",
				"json:target/cucumber-reports/report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome =false,
		dryRun=false
		//tags="@Smoke"
)
public class PhpTravelsRunner {

}
