package com.qa.stories.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage {
	
	public final String url ="http://way2automation.com/way2auto_jquery/alert.php#load_box";
	
	@FindBy(xpath="/html/body/button")
	public WebElement btn;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a")
	public WebElement inputTabBtn;
	
	@FindBy(id="demo")
	public WebElement message;
	
	public void clickBtn() {
		btn.click();
	}
	
	public void clickInputTabBtn() {
		inputTabBtn.click();
	}
	
	public String getMessage() {
		return message.getText();
	}

}
