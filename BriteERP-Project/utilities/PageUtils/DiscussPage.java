package PageUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralUtils.Driver;


public class DiscussPage{
	private static WebDriver driver;
	
	static {
		driver = Driver.setUp();
		PageFactory.initElements(driver, DiscussPage.class);
	}
	
	@FindBy(className = "o_searchview_input")
	private static WebElement searchBox;
	
	@FindBy(xpath = "//span[@title = 'Advanced Search...']")
	private static WebElement searchBoxAdvanceSearch;
	
	@FindBy(id = "//div[@data-channel-id = 'channel_inbox']")
	private static WebElement inboxTab;
	
	@FindBy(xpath = "//div[@data-channel-id = 'channel_starred']")
	private static WebElement starredTab;
	
	@FindBy(xpath = "//b[text() = 'Channels']")
	private static WebElement channelsTab;
	
	public static void setSearchBox(String text) {
		searchBox.sendKeys(text);
	}
	
	public static void advancedSearchClick() {
		searchBoxAdvanceSearch.click();
	}
	
	public static void clickInboxTab() {
		inboxTab.click();
	}
	
	public static void clickStarredTab() {
		starredTab.click();
	}
	
	public static void clickChannelsTab() {
		channelsTab.click();
	}
}
