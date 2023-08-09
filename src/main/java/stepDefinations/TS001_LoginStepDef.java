package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TS001_LoginStepDef {
	WebDriver driver;
	@Given("user is on Home page")
	public void user_is_on_home_page() {
	    System.out.println("User is on Home page");
	    driver = new ChromeDriver();
	    driver.get("https://www.rediff.com/");
	    driver.manage().window().maximize();
	    
	}
	@When("user clicks on Signin link check title")
	public void user_clicks_on_signin_link_check_title() {
	    System.out.println("Click on Signin link");
	    driver.findElement(By.linkText("Sign in")).click();
	    String title=driver.getTitle();
	    Assert.assertEquals(title, "Rediffmail");
	}
	@When("user enters valid username password")
	public void user_enters_valid_username_password() {
	   System.out.println("Enter user name and password ");
	   driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
	   driver.findElement(By.id("password")).sendKeys("arpana123");
	   
	}
	@And("clicks on Submit button")
	public void clicks_on_submit_button() {
	   System.out.println("Click on Submit button");
	   driver.findElement(By.id("remember")).click();
	   driver.findElement(By.name("proceed")).click();
	}
	@Then("validate User and display successful message")
	public void validate_user_and_display_successful_message() {
	    System.out.println("Login Successful...");
	    
	    driver.quit();
	}
	@When("user enters invalid username or valid password")
	public void user_enters_invalid_username_and_valid_password() {
	   System.out.println("Enter invalid user name and valid password");
	}
	@Then("validate error message")
	public void validate_error_message() {
	    System.out.println("Error message is displayed..");
	}
//	@When("user enters valid username and invalid password")
//	public void user_enters_valid_username_and_Invalid_password()
//	{
//		System.out.println("Enter valid user name and invalid password");
//	}




}
