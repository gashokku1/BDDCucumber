package stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;

public class CRMStepDef {
	WebDriver driver;

	
	/*
	 * @BeforeAll
	 * 
	 * public static void setup() {
	 * System.out.println("Before all the scenarios executed first");
	 * 
	 * }
	 */	
	
	@Before ("@SmokeTest")
	public static void initChromeBrowser() {
		System.out.println("Chrome browser Initialized...");
		
	}
	@Before ("@RegressionTest")
	public static void initEdgeBrowser() {
		System.out.println("Edge browser Initialized...");
		
	}
	
@AfterAll
	
	public static void tearDown() {
		System.out.println("After all the scenarios executed last");
		
	}
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

	/*
	 * @When("User Enters Credentials") public void user_search_java_tutorial() { //
	 * Write code here that turns the phrase above into concrete actions WebElement
	 * uName = driver.findElement(By.id("username")); uName.sendKeys("tomsmith");
	 * WebElement pWord = driver.findElement(By.id("password"));
	 * pWord.sendKeys("SuperSecretPassword!"); WebElement login =
	 * driver.findElement(By.xpath("//*[text()=' Login']")); login.submit();
	 * 
	 * 
	 * }
	 */
	/*
	 * //datatable concept
	 * 
	 * @When("User Enters Credentials") public void
	 * user_search_java_tutorial(DataTable dataTable) { List<<List<String>> data =
	 * dataTable.asLists(); String userName = data.get(0).get(0); String password =
	 * data.get(0).get(1); // Write code here that turns the phrase above into
	 * concrete actions WebElement uName = driver.findElement(By.id("username"));
	 * uName.sendKeys(userName); WebElement pWord =
	 * driver.findElement(By.id("password")); pWord.sendKeys(password); WebElement
	 * login = driver.findElement(By.xpath("//*[text()=' Login']")); login.submit();
	 * 
	 * 
	 * }
	 */

	// Map concept
	@When("User Enters Credentials")
		public void user_search_java_tutorial(DataTable dataTable) {
			List<<List<String>> data = dataTable.asMaps();
			String userName = data.get(0).get("username");
			String password = data.get(0).get("password");
		    // Write code here that turns the phrase above into concrete actions
			 WebElement uName = driver.findElement(By.id("username"));
			  uName.sendKeys(userName);
			  WebElement pWord = driver.findElement(By.id("password"));
			  pWord.sendKeys(password);
			  WebElement login = driver.findElement(By.xpath("//*[text()=' Login']"));
			  login.submit();
			
		    
		}

	@Then("Should display Java Tutorial Page")
	public void should_display_java_tutorial_page() {
		List<<List<String>> msg = dataTable.asLists();
		String expMsg = data.get(0).get(0);
		
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigated to the page sucessfully"+ driver.getTitle());
	  
	}

}
