package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Class {
	
	WebDriver driver;
	By link=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By log=By.xpath("//input[@value=\"Log in\"]");
	By logout=By.xpath("//a[@href='/logout']");
	
	public Page_Class(WebDriver driver) {
		this.driver=driver;
	}
	public void clicklink() {
		driver.findElement(link).click();
	}
	public void typeuname(String username) {
	   driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
	}
	public void typepassword(String password) {
		driver.findElement(pwd).sendKeys("aravind");
	}
	public void clicklogin() {
		driver.findElement(log).click();
	}
	public void logout() {
		driver.findElement(logout).click();
	}

}
