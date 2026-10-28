package org.summa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngAnnotation {
	
	WebDriver driver;
	WebDriverWait wait ;
	
@BeforeMethod

public void setup() {
	
	 driver = new ChromeDriver();
	 wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}
@Parameters({"username","Password"})
@Test

public void login(String username,String Password) {
	
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(Password);
	
}
@AfterMethod

public void teardown() {
	
	driver.quit();
	
}

}
