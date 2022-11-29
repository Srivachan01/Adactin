package com.Adactin.stepdifinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.Adactin.runner.Runner_Adactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;

public class Base_Class {

	public static WebDriver driver = Runner_Adactin.driver;

	@Given("^user Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");

	}

	@When("^user Enters The Username In Username Field$")
	public void user_Enters_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Srivachan11");
	}

	@When("^user Enters The User's Password In The Password Field$")
	public void user_Enters_The_User_s_Password_In_The_Password_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sri@7373");
	}

	@Then("^user Clicks The Submit Button$")
	public void user_Clicks_The_Submit_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}

	@When("^user Selects The Hotel Location$")
	public void user_Selects_The_Hotel_Location() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select hy = new Select(location);
		hy.selectByValue("Paris");
	}

	@When("^user Selects The Available Hotel In The Location$")
	public void user_Selects_The_Available_Hotel_In_The_Location() throws Throwable {
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select ki = new Select(hotel);
		ki.selectByValue("Hotel Creek");
	}

	@When("^user Selects The Room Type$")
	public void user_Selects_The_Room_Type() throws Throwable {
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select mm = new Select(room);
		mm.selectByValue("Deluxe");
	}

	@When("^user Selects The Number Of Rooms Required$")
	public void user_Selects_The_Number_Of_Rooms_Required() throws Throwable {
		WebElement nos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select fr = new Select(nos);
		fr.selectByValue("2");
	}

	@When("^user Enters The Check-In Date$")
	public void user_Enters_The_Check_In_Date() throws Throwable {
		WebElement checkInDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkInDate.clear();
		checkInDate.sendKeys("27/11/2022");
	}

	@When("^user Enters The Check-Out Date$")
	public void user_Enters_The_Check_Out_Date() throws Throwable {
		WebElement checkOutDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkOutDate.clear();
		checkOutDate.sendKeys("28/11/2022");
	}

	@When("^user Selects The No of Adult Occupants$")
	public void user_Selects_The_No_of_Adult_Occupants() throws Throwable {
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select ee = new Select(adult);
		ee.selectByValue("2");
	}

	@When("^user Selects The No of Child Occupants$")
	public void user_Selects_The_No_of_Child_Occupants() throws Throwable {
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select ju = new Select(child);
		ju.selectByValue("3");
	}

	@Then("^user Clicks Search Button$")
	public void user_Clicks_Search_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@When("^user Selects The Available Hotels$")
	public void user_Selects_The_Available_Hotels() throws Throwable {
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	}

	@Then("^user Clicks Continue button$")
	public void user_Clicks_Continue_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("^user Enters The First Name$")
	public void user_Enters_The_First_Name() throws Throwable {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Sri");
	}

	@When("^user Enters The Last Name$")
	public void user_Enters_The_Last_Name() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Vachan");
	}

	@When("^user Enters The Billing Address$")
	public void user_Enters_The_Billing_Address() throws Throwable {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Chennai");
	}

	@When("^user Enters The Credit Card Number$")
	public void user_Enters_The_Credit_Card_Number() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");
	}

	@When("^user Enters The Credit Card Type$")
	public void user_Enters_The_Credit_Card_Type() throws Throwable {
		WebElement card = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select ko = new Select(card);
		ko.selectByValue("MAST");
	}

	@When("^user Selects The Credit Card Expiring Month$")
	public void user_Selects_The_Credit_Card_Expiring_Month() throws Throwable {
		WebElement mon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select gt = new Select(mon);
		gt.selectByValue("4");
	}

	@When("^user Selects The Credit Card Expiring Year$")
	public void user_Selects_The_Credit_Card_Expiring_Year() throws Throwable {
		WebElement yea = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select ht = new Select(yea);
		ht.selectByValue("2019");
	}

	@When("^user Enters The CVV Number$")
	public void user_Enters_The_CVV_Number() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
	}

	@Then("^user Clicks The Book Now Button$")
	public void user_Clicks_The_Book_Now_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
	}

	@Then("^user Clicks The My Itinerary$")
	public void user_Clicks_The_My_Itinerary() throws Throwable {
		JavascriptExecutor yt = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		WebElement myt = driver.findElement(By.xpath("//input[@value='My Itinerary']"));
		yt.executeScript("arguments[0].scrollIntoView();", myt);

		myt.click();
	}

	@When("^user Selects The Unwanted Hotels$")
	public void user_Selects_The_Unwanted_Hotels() throws Throwable {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@Then("^user Clicks The Cancel Button$")
	public void user_Clicks_The_Cancel_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Cancel Selected']")).click();

		driver.switchTo().alert().accept();
	}

	@Then("^user Clicks Logout Button$")
	public void user_Clicks_Logout_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Logout']")).click();
		String ma ="Click here to login again";
		WebElement lo = driver.findElement(By.xpath("//a[@href='index.php']"));
		String out = lo.getText();
		
		if (out.equalsIgnoreCase(ma)) {
			TakesScreenshot kp = (TakesScreenshot)driver;
			File hp = kp.getScreenshotAs(OutputType.FILE);
			File hj = new File("C:\\Users\\SRIVACHAN\\eclipse-workspace\\Selenium\\Screens\\logout.png");
			
			FileHandler.copy(hp, hj);
			
		}		
		
	}

}
