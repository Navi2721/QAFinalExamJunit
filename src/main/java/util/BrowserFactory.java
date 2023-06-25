package util;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BrowserFactory {

	
	static WebDriver driver;

	public static WebDriver init() {

	
		System.setProperty(" webdriver.chrome.driver", "/Users/nebeyouyohannes/Dec2022Selenium/FinalExamCucumber/drivers/chromedriver");
		driver = new ChromeDriver();                 
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/107/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	public static void tearDown() {
		
	driver.close();
	driver.quit();
	
	}
	}

