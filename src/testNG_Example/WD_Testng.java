package testNG_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WD_Testng {
	WebDriver driver;
	@BeforeClass
	public void Startup() {
		driver=new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
	driver.close();
	}
	@Test
public void tc001()throws Exception {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Applicaton opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Reporter.log("Login completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout completed");
	

	}

}
