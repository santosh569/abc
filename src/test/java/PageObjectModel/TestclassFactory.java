package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestclassFactory {
	@Test
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		pageclassFactory pf=PageFactory.initElements(driver, pageclassFactory.class);
		driver.manage().window().maximize();
		pf.loginmethod("naghmanmehdi@gmail.com", "nmg12345");
		Thread.sleep(1000);
		driver.close();
		
	}
	

}
