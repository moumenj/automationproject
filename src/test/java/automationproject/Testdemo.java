package automationproject;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Testdemo {
	
	@Test 
	public void passtest()
	{
		
		System.out.println("test passed");
	
	}
	
	
	@Test 
	public void failtest()
	{
		System.out.println("test passed");
		//Assert.assertEquals("x", "y");
		
	}

}
