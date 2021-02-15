package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGMore {
	@Test
    public void setupchromedriver(){
		System.setProperty("webdriver.chrome.driver", ".//BrowerDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

	@Test(groups="regression")
	public void regiter(){
		System.out.println("This result givers the Registration Confirmation");
	}
	
	@Test(groups="sanity")
	public void Login(){
		System.out.println("This result givers the LogIn Confirmation");
	}
	
	@Test(groups="sanity")
	public void SearchAuto(){
		System.out.println("This result givers the Search Confirmation");
	}
	
	@Test(groups="regression")
	public void GetAuto(){
		System.out.println("This result givers the Get Confermation");
	}
	
	@Test(groups="system")
	public void PurchageAuto(){
		System.out.println("This result givers the Purchage Confermation");
	}
	
	}
