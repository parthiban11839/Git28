package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
@FindBy(name="name")

private WebElement username;


@FindBy(xpath="//form[@action='/signup']/child::input[@type='email']")
private WebElement email;

@FindBy(xpath="//button[text()='Signup']")

private WebElement signup;

public LoginPage() {
	
	PageFactory.initElements(getDriver(),this);
	
}

public void login(String userName,String mail) {
	
	waitForElement(username).sendKeys(userName);
	
	waitForElement(email).sendKeys(mail);
	
	waitForElement(signup).click();
}

}
