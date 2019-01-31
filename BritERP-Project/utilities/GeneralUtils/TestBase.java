package GeneralUtils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase {
	protected static WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver = Driver.setUp();
		driver.get(PropertyConfig.getProperty("baseUrl"));
			
	}
	
	
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		Driver.close();
	}
}
