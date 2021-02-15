import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryMoreElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		driver.findElement(By.name("fuel_type")).click();
		driver.findElement(By.xpath("//*[@id='tabs-1']/p[2]/input[2]")).click();
		driver.findElement(By.name("airbags")).click();
		driver.findElement(By.cssSelector("#tabs-1 > p:nth-child(5) > select > option:nth-child(3)")).click();
	}

}
