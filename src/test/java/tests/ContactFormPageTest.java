package tests;

import org.testng.annotations.Test;

import pages.ContactFormPage;

public class ContactFormPageTest extends BaseTest{
	
	@Test
	public void sendDataToContactForm() {
	ContactFormPage cp =	home.ContactForm();
	cp.ContactFormData();
	cp.ResetButton();
 	cp.SubmitButton();
	}

}
