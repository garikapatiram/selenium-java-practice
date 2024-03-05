package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {
	
	private WebDriver driver;
	private By bt1 = By.xpath("//*[text()=\"Button One\"]");
	private By bt2 = By.cssSelector(" #btn_two");
	private By bt3 = By.cssSelector(" #btn_three");
	private By bt4 = By.xpath("//*[text()=\"Button Four\"]");
	
	
	
	public ButtonsPage(WebDriver driver) {
		this.driver = driver;
		
	}
	 public void ButtonOne() {
		driver.findElement(bt1).click();
		String alertMessage1 = driver.switchTo().alert().getText();
		System.out.println("Button Alert Message 1 :" + alertMessage1);
		driver.switchTo().alert().accept();
		 
	 }
	 
	 public void ButtonTwo() {
		 
		 WebElement But2 = driver.findElement(bt2);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",But2);
		 String alertMessage2 = driver.switchTo().alert().getText();
		 System.out.println("Button Allert Message 2 :" + alertMessage2);
		 driver.switchTo().alert().accept();
	 }
	 
	 public void ButtonThree() {
		 
		 WebElement But3= driver.findElement(bt3);
		 Actions act = new Actions(driver);
		 act.moveToElement(But3).click().build().perform();
		 String alertMessage3 = driver.switchTo().alert().getText();
		 System.out.println("Button Allert Message 3 :" + alertMessage3);
		 driver.switchTo().alert().accept();
	 }
	 
	 public void ButtonFour() {
		 WebElement But4 = driver.findElement(bt4);
		 
		 if(But4.isEnabled()) {
			 System.out.println("Button is Enabled");
			// But4.click();
		 }else {
			System.out.println("Button is not Enabled");
		//	But4.click();
		}
		 
		/*
		 * String alertMessage4 = driver.switchTo().alert().getText();
		 * System.out.println("Button Alert message 4 :" + alertMessage4);
		 * driver.switchTo().alert().accept();
		 */
	 }
}
