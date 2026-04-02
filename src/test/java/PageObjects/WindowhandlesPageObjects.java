package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowhandlesPageObjects {

	WebDriver driver;
	
	public WindowhandlesPageObjects(WebDriver driver){
		
		this.driver=driver;
	}
	
	By popUpBtn = By.xpath("//*[contains(text(),'Popup Windows')]");
	
	public void popUpBtn() {
		
		driver.findElement(popUpBtn).click();
	}
	
	public void popUpWindowTitle() {
			
			String title = driver.getTitle();
			System.out.println("Title of the page = "+title);
		}
	
}
