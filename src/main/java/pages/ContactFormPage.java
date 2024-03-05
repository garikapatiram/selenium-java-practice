package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class ContactFormPage {
	
	private WebDriver driver;
	private By firstnamefield = By.xpath("//*[@placeholder=\"First Name\"]");
	private By lastnamefield = By.xpath("//*[@placeholder=\"Last Name\"]");
	private By emailfield = By.xpath("//*[@placeholder=\"Email Address\"]");
	private By commentfield = By.xpath("//*[@placeholder=\"Comments\"]");
	private By resetbutton = By.xpath("//*[@value=\"RESET\"]");
	private By submitbutton = By.xpath("//*[@value=\"SUBMIT\"]");
	public Faker faker;
	
	
	public ContactFormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ContactFormData() {
		faker = new Faker();
		driver.findElement(firstnamefield).sendKeys(faker.name().firstName());
		driver.findElement(lastnamefield).sendKeys(faker.name().lastName());
		driver.findElement(emailfield).sendKeys(faker.internet().emailAddress());
		driver.findElement(commentfield).sendKeys(faker.address().fullAddress());
		
	}
	
	public void ResetButton() {
		driver.findElement(resetbutton).click();
	}
	
	public void SubmitButton() {
		driver.findElement(submitbutton).click();
	}
}
