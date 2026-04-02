package Utils;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Browserutils {
	
	WebDriver driver;
	
	public Browserutils(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public static void mouseHover(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
    }

	
	        
	 
	 
    public static String takeScreenshot(WebDriver driver, String fileName) {
    	
    	TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String path = "screenshots/" + fileName + ".png";
        try {
            FileUtils.copyFile(src, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
  
	}

	public void switchToWindowByTitle(WebDriver driver, String expectedTitle) {
		for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(expectedTitle)) {
                break;
            }
        }
    }
		
	

}
