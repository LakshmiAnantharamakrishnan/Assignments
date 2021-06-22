package week4.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowLeafTap {
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		Getting URL and logging in
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
//		select contacts
		driver.findElementByLinkText("Contacts").click();
//		Select Merge Contacts
		driver.findElementByLinkText("Merge Contacts").click();
//		Tapping on image
		driver.findElementByXPath("//img[@alt='Lookup']").click();
//		Getting window reference
		Set<String> set= driver.getWindowHandles();
//		Moving to list
		List<String> list = new ArrayList<String>(set);
//		Moving control to sec window
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
//		selecting contact
		driver.findElementByXPath("//a[@class='linktext']").click();
//		Moving control to first window
		driver.switchTo().window(list.get(0));
//		Locating to image
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
//		Getting window reference and moving to set and list
		Set<String> set1= driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(set1);
//		Moving control to second window
		driver.switchTo().window(list1.get(1));
//		Selecting the to contact
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[3]").click();
//		Moving access to first window
		driver.switchTo().window(list1.get(0));
//		Clicking merge button
		driver.findElementByClassName("buttonDangerous").click();
//		Moving to alert
		Alert alert= driver.switchTo().alert();
//		Clicking OK
		alert.accept();
//		Getting the title of the page
		String title= driver.findElementByXPath("//div[text()='View Contact']").getText();
		System.out.println(title);
//		Verifying the title
	boolean val= driver.findElementByXPath("//div[text()='View Contact']").isDisplayed();
	System.out.println(val);
				

}
}