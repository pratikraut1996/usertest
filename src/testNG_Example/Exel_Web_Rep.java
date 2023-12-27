package testNG_Example;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Exel_Web_Rep {
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
public void tc001() throws Exception{
	FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\New Microsoft Excel Worksheet (2).xls");
	Workbook wb=Workbook.getWorkbook(file);
	Sheet st=wb.getSheet(0);
	String username=st.getCell(0, 1).getContents();
String password=st.getCell(1,1).getContents();
Reporter.log(username);
Reporter.log(password);
 
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Reporter.log("Login completed ");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
Reporter.log("logout completed");




}
}
