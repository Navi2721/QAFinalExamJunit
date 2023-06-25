package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckAllBoxPage {

	static WebDriver driver;
	
	public CheckAllBoxPage(WebDriver driver) {
		this.driver=driver;
		CheckAllBoxPage.driver=driver; 
	}
	@FindBy(how = How.CSS, using = "body > div.controls > input[type=checkbox]:nth-child(3)")  
	WebElement CHECK_BOX_ELEMENT;
	
	@FindBy(how = How.CSS, using = "body > div.controls > input[type=checkbox]:nth-child(3)")
	WebElement UNCHECK_BOX_ELEMENT;
	
	@FindBy(how = How.CSS, using = "div:nth-child(2) form:nth-child(1) ul:nth-child(2) li:nth-child(6) > input:nth-child(2)")
	WebElement CHECKBOX_TEST_ELEMENT;
	
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement REMOVE_SELECTED_ELEMENT;//

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/input[3]")
	WebElement CHECK_ALL_BOX_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_ALL_SELECTED_ELEMENT;

	public void UserShouldBeAbeltoCheckBoxToggleAll() {

		CHECK_BOX_ELEMENT.click();

		System.out.println("checkbox checked: " + CHECK_BOX_ELEMENT.isSelected());
	}
	public void UserShouldBeAbelToUnCheckBox() {

		UNCHECK_BOX_ELEMENT.click();

		System.out.println("checkbox unchecked: " + UNCHECK_BOX_ELEMENT);
	}
	public void UserShouldBeAbelToCheckSelectedBox() {

		CHECKBOX_TEST_ELEMENT.click();
			
			System.out.println("Check Box has been selected: " + CHECKBOX_TEST_ELEMENT.isSelected());}
		public void UserShouldBeAbelToRemoveSelectedBox() {
				
			REMOVE_SELECTED_ELEMENT.click();
			System.out.println(" Checked box have been deleted :" + REMOVE_SELECTED_ELEMENT.isSelected());
			}
			
		public void UserShouldBeAbelToCheckAllBoxes() {
			
			CHECK_ALL_BOX_ELEMENT.click();
			System.out.println("All boxes have been Checked:  " + 	CHECK_ALL_BOX_ELEMENT.isSelected());
		}
		
		public void UserShouldBeAbelToRemoveAllCheckedBoxes() {
				
				REMOVE_ALL_SELECTED_ELEMENT.click();
				System.out.println("All Selected boxes have been removed:  " + 	REMOVE_ALL_SELECTED_ELEMENT.isSelected());
			}
}