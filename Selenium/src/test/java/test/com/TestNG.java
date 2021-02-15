package test.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

	@Test(priority= 1)
	public void printname(){
		System.out.println("My name Is Sneh");
	}
	
	@Test(priority= 2)
	public void register(){
		System.out.println("code to register");
		Assert.fail();
	}
	
	@Test(priority= 3,dependsOnMethods="register")
	public void login(){
		System.out.println("code to login");
	  
	}
	
}
