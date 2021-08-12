package com.qa.stories.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {
	
	public final String url ="http://thedemosite.co.uk/addauser.php";
	
	//find username
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
	private WebElement usernameField;
	
	//find password
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
	private WebElement passwordField;
	
	//find submit
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
	private WebElement submitBtn;
	
	//find link
	@FindBy(xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement link;
	
	//public AddUserPage(WebDriver driver) throws Exception {
	//	driver.get(url);
	//}
	
	public AddUserPage addUsername(String name) {
		usernameField.sendKeys(name);
		return this;
	}
	
	public AddUserPage addPassword(String password) {
		passwordField.sendKeys(password);
		return this;
	}
	
	public AddUserPage clickSubmit() {
		submitBtn.click();
		return this;
	}
	
	public AddUserPage clickLink() {
		link.click();
		return this;
	}

}
