package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
	@CucumberOptions(
			
			features = "src/test/resources/Features",
			glue={"stepDefinitions", "Hooks"}, 
			plugin = {
					
					"pretty",
					"html:target/cucumber-reports.html"	
			},
			
			monochrome=true,
			tags="@hemanth")
	
	
	public class TestRunner extends AbstractTestNGCucumberTests{ 
	

}
