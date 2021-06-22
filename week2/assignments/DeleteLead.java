package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
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
		Thread.sleep(1000);
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9978978901");
		Thread.sleep(1000);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		WebElement element=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
        String value=element.getText();	
        System.out.println(value);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@id='x-form-el-ext-gen246']/input").sendKeys(value);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String noRecordsTo = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(noRecordsTo);
        
        	
		
			
		
		
	}

}
