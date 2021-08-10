package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public ChromeDriver driver;
  
  @Given("Open the Chrome Browser")	
  public void openBrowser() {
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
  }
	   
 @Given("Load application url")
 public void loadApplication() {
	 driver.get(" https://dev113545.service-now.com/");
 }
	 
 @Given("Enter the username as admin")
 public void enterUserName() {
	 driver.findElement(By.id("user_name")).sendKeys("admin");
 }
	  

 @Given("Enter the password as m3GkKEKU8atr")
 public void enterPassword() {
	 driver.findElement(By.id("user_password")).sendKeys("m3GkKEKU8atr");
	  
 }
 
 @When("Click on Login button")
 public void clickLoginButton() {
	 driver.findElement(By.id("sysverb_login")).click();
 }
	  
 
 @Then("HomePage should be displayed")
 public void verifyHomePager() {
	  System.out.println("HomePage is displayed");
 }
}