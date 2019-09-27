package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class parameterization_testme {
	WebDriver driver=null;
	
	@Given("^The signup page is opened$")
	public void the_signup_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("^user enters \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
	public void user_enters_as_username_and_as_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
		Thread.sleep(1000);
	  
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		driver.findElement(By.name("Login")).click();
	 	}

	@Then("^message displayed login sucessful$")
	public void message_displayed_login_sucessful() throws Throwable {
		System.out.println("Title is "+driver.getTitle());
	   
	}

}
