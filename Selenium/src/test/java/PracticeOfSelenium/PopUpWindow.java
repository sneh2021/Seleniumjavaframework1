package PracticeOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		driver.findElement(By.id("helpbutton")).click();
		driver.switchTo().window("HelpWindow");
		System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
		
		
	
	
	
	}

}
