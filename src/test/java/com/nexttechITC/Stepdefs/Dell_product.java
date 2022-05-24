package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import com.nexttechITC.PageObjectModel.Dell_productPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_product {
	
	WebDriver driver;
	@Given("^user Visits Dell HomePage$")
	public void user_Visits_Dell_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  //soft wait
		  
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		         
		  //how to maximize the browser
		  driver.manage().window().maximize();
		       
		   //how to open url  driver.get method
		   driver.get("https://www.dell.com/en-us");
		   //Thread.sleep(10000);
	  
	}

	@When("^user go to Products dropdown menu and able to see Laptops$")
	public void user_go_to_Products_dropdown_menu_and_able_to_see_Laptops() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Actions act = new Actions(driver);
	    Dell_productPOM  obj = new   Dell_productPOM(driver);
	    act.moveToElement(obj.Products()).build().perform();
	   
	}

	@When("^user go to Laptops and able to see For Home$")
	public void user_go_to_Laptops_and_able_to_see_For_Home() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Actions act = new Actions(driver);
		 Dell_productPOM  obj = new   Dell_productPOM  (driver);
	    act.moveToElement(obj.Laptops()).build().perform();
	    obj.ForHome().click();
	   // WebDriverWait Wait = new WebDriverWait(driver,30);
	    driver.quit();
	    
	}

	@Then("^user will click to For Home option$")
	public void user_will_click_to_For_Home_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
	
	   

     


	

