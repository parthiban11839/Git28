package org.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test2 {
	@Parameters({"email","pasword","topic"})
	
	@Test
	
public void tc3(String pass,String userName,String topics) 
	
	{
		System.out.println(userName);
		System.out.println(pass);
		System.out.println(topics);
		
		System.out.println("tc3");
	
}
	@Test(enabled=false)
	public void tc1() {
		System.out.println("tc1");
	}

	public void tc2() {
		
		System.out.println("tc2");
	}
}
