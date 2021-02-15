package PracticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//driver.switchTo().frame(2);//by frame number
		//driver.switchTo().frame("classFrame");
		  driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("org.openqa.selenium.devtools.events")).click();
		
		
		
		
	}

}
