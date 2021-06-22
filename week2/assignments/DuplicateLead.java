package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//java wait method to wait for two seconds
		Thread.sleep(2000);
//		Getting and Loading URL
		driver.get("http://leaftaps.com/opentaps/control/login");
//		Enter Name and Password
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(1000);
//		Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(1000);
//		leads
		driver.findElementByLinkText("Leads").click();
//		click find leads 
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("reen@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
	WebElement element=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
	String value=element.getText();
	Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
		Thread.sleep(1000);
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		Thread.sleep(1000);
		boolean display=driver.findElementByXPath("//div[text()='Duplicate Lead']").isDisplayed();
//		if condition will take true condition by default if no values is given
		if(display)
			System.out.println("Title (Duplicate Lead is present)");
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(1000);
		WebElement element1=driver.findElementById("viewLead_firstName_sp");
		String value1=element1.getText();
		if(value.equals(value1))
		{
			System.out.println("Value is Duplicated");
		}
		

		
		
		
		
		

	}

}
