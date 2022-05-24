package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.nexttechITC.PageObjectModel.FacebookSignuppom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooksignup {
	
     WebDriver driver;
     @Given("^user visiting facebook url$")
	 public void user_visiting_facebook_url() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //how to max the window to get all our web elements visible
		  //driver.manage().window().maximize();
	 //how to open the URL
	  driver.get("https://www.facebook.com/r.php");
	 }

	 @When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		 FacebookSignuppom obj=new FacebookSignuppom(driver);
		  obj.firstname().sendKeys(arg1);
		  obj.lastname().sendKeys(arg2);
		  obj.email().sendKeys(arg3);
		  obj.password().sendKeys(arg4); 
	 }

	 @Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	 public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		 
	  FacebookSignuppom se1=new FacebookSignuppom (driver);
	  
	 Select dropdown =new Select(se1.month());
	  dropdown.selectByValue("6");
	  dropdown.selectByIndex(5);
	  
	  Select dropdown1 =new Select (se1.click_day());
	  dropdown1.selectByValue("6");
	  
	  
	  Select dropdown2= new Select (se1.click_year());
	  dropdown2.selectByVisibleText("1993");
	  
	 }

}


