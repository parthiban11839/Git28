package org.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static ThreadLocal <WebDriver> driver = new ThreadLocal<>();
	
	public WebDriver getDriver() {
		return driver.get();
		}
	
	public void getBrowser(String browsertype) {
		
		switch(browsertype.toLowerCase()){
		case"chrome":
			
			WebDriverManager.chromedriver().setup();
			
			driver.set(new ChromeDriver());
			
			break;
			
         case"firefox":
			
			WebDriverManager.firefoxdriver().setup();
			
			driver.set(new FirefoxDriver());
			
			break;
			
         case"edge":
 			
 			WebDriverManager.edgedriver().setup();
 			
 			driver.set(new EdgeDriver());
 			
 			break;
 			
 			default:
 				throw new RuntimeException("Invalid Browser:"+browsertype);
		}     
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void launchUrl(String url) {
		getDriver().get(url);
	}
	
	public void closeBrowser() {
		getDriver().quit();
		driver.remove();
	}
	
	public void sendKeys(WebElement element,String value) {
		element.clear();
		element.sendKeys(value);
	
	}
    public void click(WebElement element) {
    	element.click();
    	
    }
    public String getText(WebElement element) {
    	return element.getText();
    }
    
    public void clear(WebElement element) {
    	element.clear();
    	
    }
    
    public WebElement waitForElement(WebElement element){
    	
    	WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
    	return wait.until(ExpectedConditions.visibilityOf(element));
    	
    }
	
	
}
