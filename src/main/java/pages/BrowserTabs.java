package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserTabs {
	
	private WebDriver driver;
	private By newOpenTab = By.xpath("//*[@value=\"Open Tab\"]");
	
	public BrowserTabs(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickOnOpenTab() {
			
		String parenthandle = driver.getWindowHandle();
		
		driver.findElement(newOpenTab).click();
		Set<String> handles = driver.getWindowHandles();
		
		for (String handle : handles) {
			
			if(! handle.equals(parenthandle)) {
				driver.switchTo().window(handle);
			String chaildHandleUrl = driver.getCurrentUrl();
			System.out.println("Child BrowserTabUrl:" + chaildHandleUrl);
			driver.close();
				
			}
			
		}
		
				
		/*
		 * String MainWindow=driver.getWindowHandle();
		 * 
		 * Set<String> s1=driver.getWindowHandles(); Iterator<String> i1=s1.iterator();
		 */
	}

}
