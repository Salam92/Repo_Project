package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {

	WebDriver driver;

	public DellActionPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Solutions']")

	WebElement act_Solutions1;

	public WebElement Solutions1() {
		return act_Solutions1;
	}

	@FindBy(xpath = "//a[text()='View All Solutions']")
	WebElement click_All_Solutions1;

	public WebElement allSolutions1() {
		return click_All_Solutions1;

	}

	@FindBy(xpath = "//span[text()='Solutions']")

	WebElement act_Solutions;
	WebElement act_all_Solution;

	public WebElement allSolutions() {
		return act_all_Solution;
	}

	@FindBy(xpath = "//a[text()='View All Solutions']")
	WebElement click_all_Solutions;

	public WebElement AllSolutions() {
		return click_All_Solutions1;

	}
}
