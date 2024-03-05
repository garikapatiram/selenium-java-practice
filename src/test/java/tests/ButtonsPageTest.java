package tests;

import org.testng.annotations.Test;

import pages.ButtonsPage;

public class ButtonsPageTest extends BaseTest{
	
	
	@Test(priority = 1)
	
	public void ClickButtonOne() {
		
		ButtonsPage Btp1 = home.buttons();
		Btp1.ButtonOne();
	}
	
	@Test(priority = 2 ,enabled = false)
	public void ClickButtonTwo() {
		
		ButtonsPage Btp2 = home.buttons();
		Btp2.ButtonTwo();
	}
	
	@Test(priority = 3)
	public void ClickButtonThree() {
		ButtonsPage Btp3 = home.buttons();
		Btp3.ButtonThree();
	}
	
	@Test (priority = 4)
	
	public void ClickButtonFour() {
		ButtonsPage Btp4 = home.buttons();
		Btp4.ButtonFour();
	}
}
