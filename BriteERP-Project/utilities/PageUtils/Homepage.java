package PageUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralUtils.Driver;

public class Homepage {
	private WebDriver driver;
	
	public Homepage() {
		this.driver = Driver.setUp();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href = '/web/login']")
	static WebElement signInButton;

	public static void clickSignIn() {
		try {
			signInButton.click();
		} catch (Exception e) {
			System.out.println("Unable to click sign in button");
		}
	}
}
