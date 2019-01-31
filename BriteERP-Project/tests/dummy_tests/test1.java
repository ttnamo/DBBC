package dummy_tests;

import org.testng.annotations.Test;

import GeneralUtils.PropertyConfig;
import GeneralUtils.TestBase;
import PageUtils.Homepage;
import PageUtils.OodooPage;
import PageUtils.SignInPage;

public class test1 extends TestBase {
	
	@Test
	public void test() throws InterruptedException {
		System.out.println("Test");
		OodooPage.clickBriteErpDemo();
		Thread.sleep(2000);
		SignInPage.login();
	}
}
