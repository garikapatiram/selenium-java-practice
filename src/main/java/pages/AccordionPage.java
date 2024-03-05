package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccordionPage {
	
	private WebDriver driver;
	private By platform = By.xpath("//*[@class=\"accordion\"]/div[1]");
	private By language = By.xpath("//*[@class=\"accordion\"]/div[3]");
	private By selenium = By.xpath("//*[@class=\"accordion\"]/div[5]");
	
	public AccordionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void platformPortability() {
		WebElement port = driver.findElement(platform);
		
		if (!(port.isSelected())) {
			
			port.click();
		}
		
	}
	
	public void languageSupport() {
		WebElement lang = driver.findElement(language);
		
		if(!(lang.isSelected())) {
			lang.click();
		}
		
	}
	
	public void seleniumGrid() {
		 WebElement seleg = driver.findElement(selenium);
		 
		 if(!(seleg.isSelected())) {
			 seleg.click();
			 
		 }
		
	}

}
