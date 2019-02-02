package smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

import GeneralUtils.ChannelTabPage;
import GeneralUtils.Constants;
import GeneralUtils.TestBase;
import PageUtils.DiscussPage;

public class ChannelTabTest extends TestBase{
	
	@Test
	public void clickingTest() {
		
		DiscussPage.clickChannelsTab();
		Assert.assertEquals(ChannelTabPage.getUrl(), Constants.CHANNELTAB_ENVI);
		System.out.println("ChannelTab URL PASS");
		Assert.assertTrue(ChannelTabPage.hasAllChannels());
		System.out.println("ChannelTab ALL CHANNELS PASS");
	
	}
}
