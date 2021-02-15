package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
		String pageurl = driver.getCurrentUrl();
		System.out.println("My app URL is " +pageurl);
		String title = driver.getTitle();
		System.out.println("My app Title is " +title);
		driver.findElement(By.id("heightCMS")).sendKeys("180");
		driver.findElement(By.id("weightKg")).sendKeys("7");
		driver.findElement(By.name("weightKg")).sendKeys("8");
		driver.findElement(By.id("Calculate")).click();
		String valueofBMI = driver.findElement(By.id("bmi")).getAttribute("value");
		System.out.println("The value of the BMI is " +valueofBMI);
		
}
}