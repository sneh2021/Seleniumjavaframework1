import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryNewElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		//driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		driver.findElement(By.partialLinkText("org.openqa.selenium.devtools")).click();
		
	}

}
