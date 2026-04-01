package stepDefinitions;

import io.cucumber.java.en.*;

import PageObjects.BackgroundExamplePageObjects;
import Hooks.Hooks;

public class BackgroundExample {
	
	BackgroundExamplePageObjects page;
	
	
	
	

@Given("the user clicks on the alertButton")
public void the_user_clicks_on_the_alert_button() {
	
	page = new BackgroundExamplePageObjects(Hooks.driver);
	page.alertButton();
   
}
@When("the alertPopup is displayed in the webpage")
public void the_alert_popup_is_displayed_in_the_webpage() {
	
	page.alertPopup();
    
}
@Then("user accepts the alertPopup")
public void user_accepts_the_alert_popup() {
	
	page.alertAccept();
    
}



@Given("the user clicks on the confirmButton")
public void the_user_clicks_on_the_confirm_Button() {
	
	page = new BackgroundExamplePageObjects(Hooks.driver);
	page.confirmButton();
   
}
@When("the confirmPopup is displayed in the webpage")
public void the_confirm_popup_is_displayed_in_the_webpage() {
	
	page.confirmPopUp();
    
}
@Then("user decline the Popup")
public void user_decline_the_popup() {
	
	page.confirmAccept();
    
}

	

}
