package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsPage {
	
	private WebDriver driver;
	private By dragi = By.xpath("//*[@class=\"droptarget\"][1]");
	private By drop = By.xpath("(//*[@class=\"droptarget\"])[2]");
	private By hold = By.xpath("//*[@id=\"holdDown\"]/div/p");
	private By doubleclick = By.xpath("//*[@ondblclick=\"myFunction()\"]/p");
	private By clickandhold = By.xpath("//*[text()=\"Hold Shift & Click Here\"]");
	
	public Actions builder;
	
	
	public ActionsPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void dragAndDrop() {
		
		WebElement draging = driver.findElement(dragi);
		WebElement droping = driver.findElement(drop);
		 builder = new Actions(driver);
		builder.dragAndDrop(draging, droping).build().perform();
	}
		
		/*
		 * // builder.dragAndDrop(dragi, drop).perform();
		 * 
		 * Action dragAndDrop = builder.clickAndHold(dragi) .moveToElement(drop)
		 * .release(drop) .build();
		 * 
		 * dragAndDrop.perform();
		 */
		
	
	public void holdDown() {
		WebElement holding = driver.findElement(hold);
		 builder = new Actions(driver);
		builder.clickAndHold(holding).perform();
		
	}
	
	public void doubleClickOption() {
		
		WebElement doubleclicking = driver.findElement(doubleclick);
		builder = new Actions(driver);
		builder.doubleClick(doubleclicking).build().perform();
	}
	
	public void holdShiftAndClick() {
		WebElement clickAndHold = driver.findElement(clickandhold);
		builder= new Actions(driver);
		builder.keyDown(Keys.SHIFT);
		builder.contextClick(clickAndHold).build().perform();
		
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("alertmessage:"  + alertMessage);
		driver.switchTo().alert().accept();
	}
	
	

}
