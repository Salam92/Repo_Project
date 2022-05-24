package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nexttechITC.PageObjectModel.Amazonsearchoptionpom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazonsearchoption {
	
	WebDriver driver;
	
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		//how to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //how to max the window to get all our web elements visible
		  //driver.manage().window().maximize();
	 //how to open the URL
		  driver.get("https://www.amazon.com/");
		 // Thread.sleep(5000);
		  driver.manage().window().maximize();
		  
	}
	
	//a[@href="/gp/bestsellers/?ref_=nav_cs_bestsellers"]
	//input[@id="twotabsearchtextbox"]
    
	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		Amazonsearchoptionpom AS= new Amazonsearchoptionpom (driver);
		AS.Search().sendKeys(arg1);
	  // WebDriverWait wait=new WebDriverWait(driver, 20); 
	   //Thread.sleep(5000);
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		Amazonsearchoptionpom AS= new Amazonsearchoptionpom (driver);   
	   AS.searchbutton().click();
	  // WebDriverWait wait=new WebDriverWait(driver, 20);
	   //Thread.sleep(10000);
	   driver.quit();
	}
}
