package day5Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPracticeFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcwuI9oDQ7kl5UuDMuoNgF1GLw0wrIAhlGbPocv8LbI6tUgufeaPKzVDRJ3tTZ0LgtiFBHnJvv1IMJzD2u2JC5qNztVIDwWhsm4NIt0V35_3w&smuh=60572&lh=Ac9uLj3l1Q7WE9RsXjQ");
		String pageurl = driver.getCurrentUrl();
		System.out.println("My URL is " +pageurl);		
		driver.findElement(By.id("email")).sendKeys("lata.rikhi@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Snehlata93@");
        driver.findElement(By.id("u_0_2")).click();
		
		
	 
	
	
	}

}
