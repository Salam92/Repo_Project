package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonBestsellerPOM {

	
	WebDriver driver;

	public amazonBestsellerPOM(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
     WebElement Clicks_Best_seller;
     public WebElement Bestseller() {
    	 return Clicks_Best_seller;
     }
 
		   
     
	}


