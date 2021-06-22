package week2.assignments;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
//		setting up chrome driver
		WebDriverManager.chromedriver().setup();
//		creating object for chromedriver class
		ChromeDriver driver=new ChromeDriver();
		//Maximizing the window
		driver.manage().window().maximize();

		//java wait method to wait for two seconds
		Thread.sleep(2000);
//		Getting and Loading URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		Thread.sleep(1000);
		driver.findElementById("firstNameField").sendKeys("Lakshmi");
		driver.findElementById("lastNameField").sendKeys("Anantharamakrishnan");
		Thread.sleep(1000);
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Gold");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Gold");
		Thread.sleep(1000);
		driver.findElementByName("departmentName").sendKeys("Alexa");
		driver.findElementById("createContactForm_description").sendKeys("Alexa is a voice assistant which is used to for communication");
		Thread.sleep(1000);
	
		driver.findElementById("createContactForm_primaryEmail").sendKeys("xyz@amazon.com");
		Select dd=new Select(driver.findElementByName("generalStateProvinceGeoId"));
		dd.selectByVisibleText("New York");
		Thread.sleep(1000);
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(1000);
		driver.findElementById("updateContactForm_description").clear();
		Thread.sleep(1000);
		driver.findElementByName("importantNote").sendKeys("Alexa helps during emergency");
		Thread.sleep(1000);
		driver.findElementByXPath("//td[@colspan='4']/input").click();
		System.out.println("Title is "+driver.getTitle());
		
		
		
		
		
	}

}
