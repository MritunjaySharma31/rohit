package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepdefination 
{
	WebDriver driver;
	@Given("when the users opens the browser and load the application")
	public void when_the_users_opens_the_browser_and_load_the_application() {
      driver = new ChromeDriver();
      driver.get("http://127.0.0.1/login.do");
      
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User enters the valid Username and password")
	public void user_enters_the_valid_Username_and_password() {
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clicks on the Login Button")
	public void user_clicks_on_the_Login_Button() {
	   driver.findElement(By.xpath("//a[.= 'Login']"));
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should go to the home page")
	public void user_should_go_to_the_home_page() {
	    Assert.assertEquals("", "");
	    driver.close();
	    throw new io.cucumber.java.PendingException();
	}




}
