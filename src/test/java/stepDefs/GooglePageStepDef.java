package stepDefs;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;

public class GooglePageStepDef {
	WebDriver driver;
	@BeforeTest
	public void start() {
	ChromeOptions opt = new ChromeOptions();
	opt.setBrowserVersion("120");
	driver = new ChromeDriver(opt);

	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement element = driver.findElement(By.tagName("textarea"));
		element.sendKeys("Java Tutorial");
		element.sendKeys(Keys.ENTER);
		System.out.println("The title is " + driver.getTitle());
		driver.navigate().back();
		System.out.println("The title after navigate().back() is  " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("The title is after navigate().forward() " + driver.getTitle());
	    
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement element = driver.findElement(By.tagName("textarea"));
		element.sendKeys("Java Tutorial");
		element.sendKeys(Keys.ENTER);
		System.out.println("The title is " + driver.getTitle());
		
	    
	}
	@Then("Should display Java Tutorial Page")
	public void should_display_java_tutorial_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().back();
		System.out.println("The title after navigate().back() is  " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("The title is after navigate().forward() " + driver.getTitle());
	  
	}


}
