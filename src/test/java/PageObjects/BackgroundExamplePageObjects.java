package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BackgroundExamplePageObjects {
	
	WebDriver driver;
	
	public BackgroundExamplePageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	By alert = By.xpath("//*[@id='alertBtn']"); 
	
	By confirmPopup = By.xpath("//*[@id='confirmBtn']");
	
	
	public void alertButton() {
		
		driver.findElement(alert).click();
	}
	
	public void alertPopup() {
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println("Popup message : "+text);
		
		
	}
	
	
	public void alertAccept() {
		
		driver.switchTo().alert().accept();
	}
	
	
	
	
	public void confirmButton() {
		
		driver.findElement(confirmPopup).click();
	}
	
	public void confirmPopUp() {
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println("Popup message : "+text);
		
		
	}
	
	
	public void confirmAccept() {
		
		driver.switchTo().alert().dismiss();;
	}

}
