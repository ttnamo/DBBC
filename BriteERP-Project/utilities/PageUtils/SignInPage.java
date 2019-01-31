package PageUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralUtils.Constants;
import GeneralUtils.Driver;

public class SignInPage {
	private static WebDriver driver;
	/*
	 * THIS PAGE HOLDS ALL THE ELEMENTS FOR THE SIGN IN PAGE
	 * 
	 */
	static {
		driver = Driver.setUp();
		PageFactory.initElements(driver, SignInPage.class);
	}
	
	@FindBy(id = "login")
	private static WebElement loginTextBox;
	
	@FindBy(id = "password")
	private static WebElement passwordTextBox;
	
	@FindBy(xpath = "//button[text() = 'Log in']")
	private static WebElement loginButton;
	
	public static void login() {
		try {
			loginTextBox.sendKeys("in_manager4@info.com");
			passwordTextBox.sendKeys("Wdf4ssa47");
			loginButton.click();
		}catch(Exception e) {
			String methodName = e.getStackTrace()[0].getMethodName();
			String exception = e.getClass().getSimpleName();
			System.out.println(exception + ":" + Constants.SENDKEYS_FAIL + methodName);
		}
	}
	
	
	
	
	
	
	
	
	
	}
