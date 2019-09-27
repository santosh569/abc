package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login1 {
	
	WebDriver driver=null;
	@Given("^The login page is opened$")
	public void the_login_page_is_opened()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("^user enters \"([^\"]*)\" as a username and \"([^\"]*)\" as a password$")
	public void user_enters_as_a_username_and_as_a_password(String arg1, String arg2) {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
	}

	@When("^user clicks login Button$")
	public void user_clicks_login_Button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("^user will Finds a testmeapp homepage$")
	public void user_will_Finds_a_testmeapp_homepage() {
		System.out.println("Title is "+driver.getTitle());
	}


}
