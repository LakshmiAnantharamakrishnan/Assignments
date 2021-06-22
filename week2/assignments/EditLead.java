package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
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
		driver.findElementByXPath("//div[@class='x-form-element']/input[@id='ext-gen248']").sendKeys("Naveen");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.findElementByXPath("//a[@class='subMenuButton'][3]").click();
		Thread.sleep(1000);
		driver.findElementById("updateLeadForm_companyName").clear();
		Thread.sleep(1000);
		driver.findElementById("updateLeadForm_companyName").sendKeys("Amazon");
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();
		Thread.sleep(1000);
		WebElement element= driver.findElementById("viewLead_companyName_sp");
		Thread.sleep(1000);
		String value=element.getText();
		System.out.println(value);
		
	}

}
