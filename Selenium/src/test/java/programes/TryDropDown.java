package programes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TryDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		//driver.findElement(By.name("make"));
		Select objs = new Select(driver.findElement(By.name("make")));
		objs.selectByIndex(3);
		objs.selectByValue("bmw");
		objs.selectByVisibleText("BMW");
		//objs.getOptions().size()
		
		for(int i=0; i<objs.getOptions().size(); i++){
		System.out.println(objs.getOptions().get(i).getText());
		}
	}

}
