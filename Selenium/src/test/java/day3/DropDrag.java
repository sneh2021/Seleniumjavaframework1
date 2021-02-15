package day3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/DragDropDemo.html");
		Actions obja = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//*[@id='draggable']/p"));
	    WebElement target = driver.findElement(By.xpath("//*[@id='droppable']/p"));
				//obja.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']/p"),driver.findElement(By.xpath("//*[@id='droppable']"));
	obja.dragAndDrop(source, target).perform();
	}

}
