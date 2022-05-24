package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.BestBuyaccountpom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestBuyaccountcreation {

WebDriver driver;

@Given("^user visit best buy homepage$")
public void user_visit_best_buy_homepage() throws Throwable {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //how to max the window to get all our web elements visible
		  driver.manage().window().maximize();
	 //how to open the URL
	  driver.get("https://www.bestbuy.com/");
	  Thread.sleep(500);
	 }


@When("^user clicks account$")
public void user_clicks_account() throws Throwable {
	BestBuyaccountpom bb=new BestBuyaccountpom (driver);
	bb.account().click();
	//WebDriverWait wait=new WebDriverWait(driver,20);

	
}

@When("^user click create account$")
public void user_click_create_account() throws Throwable {
	BestBuyaccountpom bb2=new BestBuyaccountpom (driver);
	bb2.create_accountt().click();
	
	//WebDriverWait wait=new WebDriverWait(driver,20);
}

@When("^user enter valid “Shima” and “Alam” and \"shima\\.alam(\\d+)@gmail\\.com” and “Denton@(\\d+)” and “Denton@(\\d+)” and “(\\d+)”$")
public void user_enter_valid_Shima_and_Alam_and_shima_alam_gmail_com_and_Denton_and_Denton_and(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	BestBuyaccountpom bb3=new BestBuyaccountpom (driver);
	bb3.firstname().sendKeys("Shima");
	bb3.lastname().sendKeys("Alam");
	bb3.email().sendKeys("shima.alam1992@gmail.com");
	bb3.password().sendKeys("Denton#595");
	bb3.confirmpassword().sendKeys("Denton#595");
	bb3.phonenumber().sendKeys("9405950515");
	
	//WebDriverWait wait=new WebDriverWait(driver,20);
	
}

@Then("^user should be able to redirect successfully$")
public void user_should_be_able_to_redirect_successfully() throws Throwable {
    
}
}