package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {
	WebDriver driver;
	 @Given("^user visits Dell homepage$")
	 public void user_visits_Dell_homepage() throws Throwable {
	   
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	     //soft wait
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	         
	           //how to maximize the browser
	  driver.manage().window().maximize();
	       
	       //how to open url  driver.get method
	   driver.get("https://www.dell.com/en-us");
	        Thread.sleep(500);
	 }

	 @When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	 public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
	  Actions act =new Actions (driver);
	  DellActionPOM  obj =new  DellActionPOM  (driver);
	  act.moveToElement(obj.Solutions1()).build().perform();
	  obj.AllSolutions().click();
	 // WebDriverWait wait=new WebDriverWait(driver, 30) ;
	  driver.quit();
	  }
	 @Then("^user redirects to Solution portfolio$")
		public void user_redirects_to_Solution_portfolio() throws Throwable {
		// Actions act =new Actions (driver);
		 DellActionPOM  obj =new  DellActionPOM  (driver);
		 obj.AllSolutions().click();
	 }
		    

	  }   
	 
	 
	  
	  
	 	
	 	

	


