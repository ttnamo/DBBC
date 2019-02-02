package GeneralUtils;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChannelTabPage {
	private static WebDriver driver;
	
	static {
		driver = Driver.setUp();
		PageFactory.initElements(driver, ChannelTabPage.class);
	}
	
	@FindAll( {@FindBy(xpath = "//div[@class = 'oe_module_vignette oe_kanban_global_click o_kanban_record']")} )
	private static List<WebElement> channels;
	
	public static String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public static boolean hasAllChannels() {
		
		if(getUrl().equals(Constants.CHANNELTAB_ENVI)) {
			int count = 0;
			for(WebElement each : channels) {
				if(each.isDisplayed())
					count++;
					if(count == channels.size()) {
						return true;
					}
			}
		}
		return false;
	}
}
