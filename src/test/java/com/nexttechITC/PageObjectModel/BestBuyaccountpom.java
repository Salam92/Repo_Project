package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBuyaccountpom {
	
	WebDriver driver;
	
	public BestBuyaccountpom (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class=\"v-p-right-xxs line-clamp\"]")

	WebElement click_account;
	public WebElement account() {
		return click_account;
	}	
	
	//@FindBy(xpath="//*[@id=\"shop-account-menu-2d70bf23-279e-45fa-b3bc-2b7d4e56067b\"]/div/div/div[1]/div/div[1]/div/div/a[2]")
     @FindBy(xpath="//a[@href=\"/identity/global/createAccount\"]")

	WebElement click_create_account;
	public WebElement create_accountt() {
		return click_create_account;
	}
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement edit_firstname;
	public WebElement firstname() {
		return edit_firstname;
	}

	@FindBy(xpath="//*[@id=\"lastName\"]")
	WebElement edit_lastname;

	public WebElement lastname() {
		return edit_lastname;
	}

	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement edit_email;

	public WebElement email() {
		return edit_email;
	}
	
	@FindBy(xpath="//*[@id=\"fld-p1\"]")
	WebElement edit_password;
    public WebElement password() {
    return 	edit_password;
	}	
    @FindBy(xpath="//*[@id=\"reenterPassword\"]")
    WebElement edit_confirmpassword;
    public WebElement confirmpassword() {
    return	edit_confirmpassword;
    }
    @FindBy(xpath="//*[@id=\"phone\"]")	
    WebElement edit_phonenumber;
    public WebElement phonenumber() {
    	return edit_phonenumber;
    }
    
}	
	
		
		
	

