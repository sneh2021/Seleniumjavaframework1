package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TryAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		driver.findElement(By.id("simple")).click();
		Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    driver.findElement(By.id("confirm")).click();
	    //driver.switchTo().alert().accept();
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(2000); // put 2sec delay
	    driver.findElement(By.id("prompt")).click();
	    driver.switchTo().alert().sendKeys("Sneh");
	    driver.switchTo().alert().accept();
        	
	
	
	}

}
