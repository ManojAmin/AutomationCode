package com.PhpTravels.modules;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUpImpl extends DriverSetUp {

	private DriverSetUp driveSetUp;
	//public static Logger log; 

	public DriverSetUpImpl(DriverSetUp driveSetUp) {
		super();
		this.driveSetUp = driveSetUp;
		
		
	}

	@Before
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driveSetUp.driver=new ChromeDriver(options);
		
		driveSetUp.driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		System.out.println("Close browser");
		driveSetUp.driver.quit();
	}
}
