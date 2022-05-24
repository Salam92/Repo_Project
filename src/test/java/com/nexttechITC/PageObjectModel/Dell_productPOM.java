package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_productPOM {
	
	WebDriver driver;
	public Dell_productPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Products']")
	WebElement act_Products;
	public WebElement Products() { 
	return act_Products;
	}
	
	@FindBy(xpath="//a[text()='Laptops']")
	WebElement act_Laptops;
	public WebElement Laptops() { 
	return act_Laptops;
	}
	
	@FindBy(xpath="//a[@href=\"//www.dell.com/en-us/shop/scc/sc/laptops\"]")
	WebElement click_ForHome;
	public WebElement ForHome() { 
	return click_ForHome;
	}
}

