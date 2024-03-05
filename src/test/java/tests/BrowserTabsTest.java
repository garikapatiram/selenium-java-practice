package tests;

import org.testng.annotations.Test;

import pages.BrowserTabs;

public class BrowserTabsTest extends BaseTest{
	
	@Test
	
	public void newBrowserTab() {
	 BrowserTabs bt = home.browserTab();
	 bt.clickOnOpenTab();
	}

}
