package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.BasePage;

public class BaseTest {
	
	private WebDriver driver;
	public BasePage home;
	
	
	@BeforeMethod
	public void setup() {
		
	//	driver= new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("incognito");
	//	options.addArguments("headless");
	    driver = new ChromeDriver(options);
	
		driver.get("https://www.automationtesting.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@class =\"close-cookie-warning\"]")).click();
		driver.findElement(By.xpath("//*[@class =\"toggle\"]")).click();
				
		home = new BasePage(driver);
		
	}
	
	@AfterMethod
	
	public void teardown() {
	 driver.quit();
	}

}
