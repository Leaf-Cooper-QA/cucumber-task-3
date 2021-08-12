package com.qa.stories.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectPage {
	
	public final String url = "http://way2automation.com/way2auto_jquery/selectable.php#load_box";
	
	@FindBy(xpath="/html/body/ol/li[3]")
	public WebElement item3;
	

	
	public SelectPage clickItem3() {
		item3.click();
		return this;
	}
	
	public  String getItem3Class() {
		return item3.getAttribute("class");
	}

}
