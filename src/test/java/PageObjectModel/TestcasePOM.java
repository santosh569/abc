package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcasePOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Page_Class Pobject=new Page_Class(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Pobject.clicklink();
		String username=null;
		Pobject.typeuname(username);
		String password=null;
		Pobject.typepassword(password);
		Pobject.clicklogin();
		Pobject.logout();
		System.out.println("Title is "+driver.getTitle());
		
		

	}

}
