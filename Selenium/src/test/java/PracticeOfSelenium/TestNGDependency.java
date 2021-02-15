package PracticeOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependency {

      //priority are used to proritize the steps which we are want to print in sequence			
		@Test(priority=1)
		public void regiter(){
			System.out.println("This result givers the Registration Confirmation");
		}
		
		@Test(priority=2)
		public void Add(){
			System.out.println("This result givers the Add Confirmation");
			Assert.fail();                       // fail used to fail any function forcefully
			
		}
		@Test(priority=3, dependsOnMethods="Add")             //dependsonmethods are used where we need to create the dependency between two functions
		public void Help(){
			System.out.println("This result givers the Help Confirmation");
		}
		
}
