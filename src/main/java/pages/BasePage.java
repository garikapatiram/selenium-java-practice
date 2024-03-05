package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	private WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void menuButton() {
		
		driver.findElement(By.xpath("//*[@class =\"toggle\"]")).click();
	}
	
	public void homePage() {
		
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		
	//	return new HomePage(driver);
	}
	
	public AccordionPage accordion() {
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		
		return new AccordionPage(driver);
	}
	
	public ActionsPage actions() {
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		
		return new ActionsPage(driver);
	}
	
	public BrowserTabs browserTab() {
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		return new BrowserTabs(driver);
		
	}
	
	public ButtonsPage buttons() {
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[5]/a")).click();
		return new ButtonsPage(driver);
	}
	
	public ContactFormPage ContactForm() {
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[7]/a")).click();
		return new ContactFormPage(driver);
	}
	
	/*
	 * private void clickLink(String linkText) {
	 * 
	 * driver.findElement(By.linkText(linkText)).click();
	 * 
	 * }
	 */

}
