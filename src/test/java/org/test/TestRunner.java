package org.test;

import org.base.BaseClass;
import org.page.LoginPage;

public class TestRunner extends BaseClass{
	
	public static void main(String[] args) {
		
		BaseClass bs= new BaseClass();
		
		bs.getBrowser("chrome");
		
		bs.launchUrl("https://automationexercise.com/login");
		
		LoginPage log = new LoginPage();
		
		log.login("dparthiban", "dpathiban199@gmail.com");
		
	
	}

}
