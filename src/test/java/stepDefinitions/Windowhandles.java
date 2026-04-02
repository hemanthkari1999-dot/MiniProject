package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.WindowhandlesPageObjects;
import io.cucumber.java.en.*;
import Hooks.Hooks;
import Utils.Browserutils;
public class Windowhandles {
	
			
		WebDriver driver;	
		WindowhandlesPageObjects window;
		Browserutils utils;
		
		
		@When("user clicks on the popUp windows button")
		public void user_clicks_on_the_pop_up_windows_button() {
			
		    window = new WindowhandlesPageObjects(Hooks.driver);
		    window.popUpBtn();
		}
		
		
		@Then("new popUp window opened successfully {string}")
		public void new_pop_up_window_opened_successfully(String expectedTitle) {
			
			 utils = new Browserutils(Hooks.driver);
		    utils.switchToWindowByTitle(Hooks.driver, expectedTitle);
		    String actualTitle = Hooks.driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
		}
	
		
		
		@Then("user validates the title of the new popUp window")
		public void user_validates_the_title_of_the_new_pop_up_window() {
		 
			window.popUpWindowTitle();
		}

}
