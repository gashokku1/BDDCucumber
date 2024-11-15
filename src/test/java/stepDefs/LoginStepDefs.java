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

public class LoginStepDefs {
	WebDriver driver;
	
	
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		 public void LaunchPage() throws InterruptedException {
			 ChromeOptions opt = new ChromeOptions();
				opt.setBrowserVersion("120");
				driver = new ChromeDriver(opt);

				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
			 
			  
			 
			  
		  }
	    
	}
	@When("User Enters Credentials")
	public void user_search_java_tutorial() {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement uName = driver.findElement(By.id("username"));
		  uName.sendKeys("tomsmith");
		  WebElement pWord = driver.findElement(By.id("password"));
		  pWord.sendKeys("SuperSecretPassword!");
		  WebElement login = driver.findElement(By.xpath("//*[text()=' Login']"));
		  login.submit();
		
	    
	}
	@Then("Should display Java Tutorial Page")
	public void should_display_java_tutorial_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigated to the page sucessfully"+ driver.getTitle());
	  
	}


}
