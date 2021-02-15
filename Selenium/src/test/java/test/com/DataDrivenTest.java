package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

	
	@Test(dataProvider="getdata")
	public void bmicalculator(String ht,String wt){
	System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
	driver.findElement(By.id("heightCMS")).sendKeys(ht);
	driver.findElement(By.id("weightKg")).sendKeys(wt);
	driver.findElement(By.id("Calculate")).click();
}
	 @DataProvider(name="getdata")
     public Object[][] generatedata(){
		 
		 //int[][] data ={{3,4,5},{6,7,8}};
		 String [][] htwtdata={{"178","45"},{"198","77"},{"123","34"}};
		 return htwtdata;
//this function is going to generate and pass the data to other function
	
	
	
}
}



