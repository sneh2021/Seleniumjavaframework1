package day1.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		//WebDriver driver = new chromeDriver(); Can run any driver with the help of webdriver
		driver= new EdgeDriver(); //
		driver.get("https://www.amazon.ca/");
		//shortcut to import is Shift +Ctrl+O
		
	}

}
