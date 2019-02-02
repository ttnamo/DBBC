package PageUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralUtils.Constants;
import GeneralUtils.Driver;
import GeneralUtils.FailMessages;

public class DiscussPage {
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

	@FindBy(xpath = "//h4[@class = 'o_mail_open_channels']//following-sibling::span")
	private static WebElement channelAdd;

	@FindBy(xpath = "//input[@placeholder = 'Add a channel']")
	private static WebElement channelAddName;

	@FindBy(className = "ui-menu-item")
	private static WebElement channelHiddenCreate;

	public static void search(String text) {
		searchBox.sendKeys(text);
		searchBox.submit();
	}

	public static void advancedSearchClick() {
		try {
			starredTab.click();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Unable to click Starred Tab");
		}
	}

	public static void clickInboxTab() {
		try {
			inboxTab.click();
		} catch (Exception e) {
			System.out.println("Unable to click Starred Tab");
		}

	}

	public static void clickStarredTab() {
		try {
			starredTab.click();
		} catch (Exception e) {
			System.out.println("Unable to click Starred Tab");
		}
	}

	public static void clickChannelsTab() {
		try {
			channelsTab.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Unable to click channels tab");
		}
	}

	public static void createChannel(String environment, String name) {

		switch (environment) {

		case "discuss":
			try {
				channelAdd.click();
				channelAddName.sendKeys(name);
				channelHiddenCreate.click();
			} catch (Exception e) {
				System.out.println(FailMessages.fail(e));
			}
			break;

		}
	}
}
