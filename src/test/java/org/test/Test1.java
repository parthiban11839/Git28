package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {
	
	@Test(enabled=false)
	public void tc3() {
		
		System.out.println("tc3");
	}

	@Test
	public void tc1() {
		
		System.out.println("tc1");
		
		//hard Assert
		
		//Assert.assertTrue(false);
		//System.out.println("tc3");
		//System.out.println("tc2");
		
//		String s = "Welcome";
//		Assert.assertEquals("Welcome", s,"Validate successfully");
//		
//		System.out.println("tc3");
		
		//soft Assert
		
		SoftAssert s = new SoftAssert();
		
		s.assertTrue(false);
		
		System.out.println("tc3");
		System.out.println("tc2");
		
		System.out.println("tc3");
		
		s.assertAll();
	}
	
	
	
	
	@Test(enabled=false)
	public void tc2() {
		
		System.out.println("tc2");
		
	}

}
