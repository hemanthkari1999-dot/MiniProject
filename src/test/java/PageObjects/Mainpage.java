package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mainpage {
	
	WebDriver driver;
	
	 public Mainpage(WebDriver driver) {
	        this.driver = driver;
	    }
	
	By Name = By.cssSelector("#name");
	
	public void enterName(String name) {
		
		driver.findElement(Name).sendKeys(name);
	}
	

}
