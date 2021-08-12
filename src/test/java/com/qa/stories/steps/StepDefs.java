package com.qa.stories.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.stories.hooks.SeleniumHooks;
import com.qa.stories.pages.AddUserPage;
import com.qa.stories.pages.AlertPage;
import com.qa.stories.pages.LoginPage;
import com.qa.stories.pages.SelectPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private AddUserPage addUserPage;
	private SelectPage selectPage;
	private AlertPage alertPage;
	
	public StepDefs(SeleniumHooks hooks) {
		this.driver=hooks.getDriver();
		this.loginPage=PageFactory.initElements(driver, LoginPage.class);
		this.addUserPage=PageFactory.initElements(driver, AddUserPage.class);
		this.selectPage=PageFactory.initElements(driver, SelectPage.class);
		this.alertPage=PageFactory.initElements(driver, AlertPage.class);
	}
	
	@Given("I am on {string}")
	public void iAmOn(String string) {
		driver.get(string);
	}

	@When("I enter my username")
	public void iEnterMyUsername() {
		addUserPage.addUsername("username1");
	}

	@When("I enter my password")
	public void iEnterMyPassword() {
		addUserPage.addPassword("password1");
	}

	@When("I click save")
	public void iClickSave() {
	    addUserPage.clickSubmit();
	}

	@When("I click to the next page")
	public void iClickToTheNextPage() {
		addUserPage.clickLink();
	}

	@When("I enter my username again")
	public void iEnterMyUsernameAgain() {
		loginPage.addUsername("username1");
	}

	@When("I enter my password again")
	public void iEnterMyPasswordAgain() {
		loginPage.addPassword("password1");
	}

	@When("I click test")
	public void iClickTest() {
		loginPage.clickSubmit();
	}

	@Then("I should see my login is succesful")
	public void iShouldSeeMyLoginIsSuccesful() {
		assertEquals("**Successful Login**", loginPage.getText());
	}
	
	@Given("I am on iframe {int}")
	public void iAmOnIframe(Integer int1) {
		driver.switchTo().frame(int1);
	}

	@When("I select the item")
	public void iSelectTheItem() {
		selectPage.clickItem3();
	}

	@Then("I can verify the item is selected")
	public void iCanVerifyTheItemIsSelected() {
		assertTrue(selectPage.getItem3Class().contains("ui-selected"));
	}
	
	@Given("I am on the correct tab")
	public void iAmOnTheCorrectTab() {
		alertPage.clickInputTabBtn();
	}
	
	@When("I click the alert button")
	public void iClickTheAlertButton() {
		alertPage.clickBtn();
	}

	@When("I submit and close the alert")
	public void iSubmitAndCloseTheAlert() {
		Alert alert = driver.switchTo().alert();
		String name = "Leaf Cooper";
		alert.sendKeys(name);
		alert.accept();
	}

	@Then("my message should be visible")
	public void myMessageShouldBeVisible() {
		assertTrue(alertPage.getMessage().contains("Leaf Cooper"));
	}

}
