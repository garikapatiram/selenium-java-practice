package tests;

import org.testng.annotations.Test;

import pages.ActionsPage;

public class ActionsTest extends BaseTest {
	
	@Test(priority = 1)
	
	public void DragAndDrop() {
		
		ActionsPage acc = home.actions();
		
		acc.dragAndDrop();
	}
	
	@Test (priority = 2)
	
	public void HoldDown() {
		
		ActionsPage acc = home.actions();
		acc.holdDown();
	}

		@Test(priority = 3)
		public void DoubleClick() {
			ActionsPage acc = home.actions();
			acc.doubleClickOption();
		}
		
		@Test (priority = 4)
		public void HoldShiftAndClick() {
			ActionsPage ac = home.actions();
			ac.holdShiftAndClick();
		}
}
