package tests;

import org.testng.annotations.Test;

import pages.AccordionPage;

public class AccordionTest extends BaseTest {
	
	@Test (priority = 1)
	
	public void selectPlatformOption() {
		
		AccordionPage ac = home.accordion();
		ac.platformPortability();
		
	}
	
	@Test(priority = 2)
	
	public void selectLanguageOption() {
		AccordionPage ac = home.accordion();
		ac.languageSupport();
		
	}
	
	@Test(priority = 3)
	public void selectSeleniumGrid() {
		
		AccordionPage ac = home.accordion();
		ac.seleniumGrid();
	}

}
