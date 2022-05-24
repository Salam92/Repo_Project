package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nexttechITC.PageObjectModel.amazonBestsellerPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbestseller {
	

	WebDriver driver;
	
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //how to open the URL
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.com/");
		  
		  
	}

	
	
	@When("^user clicks on Best seller$")
	public void user_clicks_on_Best_seller() throws Throwable {
		 amazonBestsellerPOM pom=new  amazonBestsellerPOM (driver);
		pom.Bestseller().click();
		
		
	}

	@Then("^user should be able to redirect to the Best Seller Page$")
	public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
		
	}    

	}

