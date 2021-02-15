package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {

	@Test
	public void compareHending(){
		
		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert objsoftassert = new SoftAssert();
		driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
		String expertedHeadingReult = "BMI CALCULATOR";
		String expectelabel="Enter Your Height and Weight (in Metric) to Calculate Your BMI";
		String actualHeadingReult = driver.findElement(By.xpath("//*[@id='header']/h2")).getText();
		System.out.println("My expected page heading is" +expertedHeadingReult);
		System.out.println("My actual page heading is" +actualHeadingReult);
		String actuallable=driver.findElement(By.xpath("//*[@id='header']/div")).getText();
		objsoftassert.assertEquals(expertedHeadingReult, actualHeadingReult);
		objsoftassert.assertEquals(actuallable, expectelabel);
		objsoftassert.assertAll();
	}
}
