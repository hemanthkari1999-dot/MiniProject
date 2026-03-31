package stepDefinitions;

import io.cucumber.java.en.*;
import PageObjects.Mainpage;
import Hooks.Hooks;


public class MainPagee {

	Mainpage page;
	

@Given("user navigates to the webpage")
public void user_navigates_to_the_webpage() {
    
	
	Hooks.driver.get("https://testautomationpractice.blogspot.com/");
	 page = new Mainpage(Hooks.driver);
	
}
@Then("user Enter the name in the {string}")
public void user_enter_the_name_in_the(String name) {
	
	page.enterName(name);
    
}

}
