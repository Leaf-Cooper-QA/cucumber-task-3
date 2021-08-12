package com.qa.stories.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public final String url ="http://thedemosite.co.uk/login.php";
	
	//find username
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	private WebElement usernameField;
	
	//find password
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	private WebElement passwordField;
	
	//find submit
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	private WebElement submitBtn;
	
	//find text box
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement textBox;
	
	//public LoginPage(WebDriver driver) throws Exception {
	//	driver.get(url);
	//}
	
	public LoginPage addUsername(String name) {
		usernameField.sendKeys(name);
		return this;
	}
	
	public LoginPage addPassword(String password) {
		passwordField.sendKeys(password);
		return this;
	}
	
	public LoginPage clickSubmit() {
		submitBtn.click();
		return this;
	}
	
	public String getText() {
		return textBox.getText();
		}

}
