package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactin//feature", glue = "com.Adactin.stepdifinition", monochrome = true, dryRun = false, strict = true, plugin = {
		"html:Reports/Adactin_Test", "pretty", "json:Reports/Adactin_Test1.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/AdactinReport.html" })

public class Runner_Adactin {
	public static WebDriver driver;

	@BeforeClass
	public static void driver_Launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void driverClose() {
		driver.close();

	}
}
