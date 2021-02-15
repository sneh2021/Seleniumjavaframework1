package PracticeOfSelenium;

import org.testng.annotations.Test;

public class TestNGMoreCases {

	@Test(groups="sanity")
	public void register(){
		System.out.println("This is for Registration code");
	}
	
	@Test(groups="regression")
	public void login(){
		System.out.println("This is for LogIn code");
	}
	
	@Test(groups="system")
	public void search(){
		System.out.println("This is for Search code");
	}
	
	@Test(groups="sanity")
	public void regist(){
		System.out.println("This is for Regist code");
	}
	
	
	
	
	
	
	
	
}
