package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.CheckAllBoxPage;
import util.BrowserFactory;

public class CheckBoxTest {

	static WebDriver driver;

	@Test
	public void pageInit() throws InterruptedException {

		driver = BrowserFactory.init();
		CheckAllBoxPage checkbox = PageFactory.initElements(driver, CheckAllBoxPage.class);
		checkbox.UserShouldBeAbeltoCheckBoxToggleAll();
		Thread.sleep(3000);

		checkbox.UserShouldBeAbelToUnCheckBox();
		Thread.sleep(3000);
		checkbox.UserShouldBeAbelToCheckSelectedBox(); 
		Thread.sleep(3000);
		checkbox.UserShouldBeAbelToRemoveSelectedBox(); 
		Thread.sleep(3000);
		checkbox.UserShouldBeAbelToCheckAllBoxes();
		Thread.sleep(3000);
		
		checkbox.UserShouldBeAbelToRemoveAllCheckedBoxes(); 
		Thread.sleep(3000); }
		 
	}
	

