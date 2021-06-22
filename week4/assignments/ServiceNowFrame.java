package week4.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowFrame {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		Getting URL
		driver.get("https://dev111627.service-now.com/");
//		Entering into Frame
		driver.switchTo().frame("gsft_main");
//		Entering UserName
		driver.findElementById("user_name").sendKeys("admin");
//		Entering password
		driver.findElementById("user_password").sendKeys("India@123");
//		Click Login
		driver.findElementById("sysverb_login").click();
//		Exit Frame
		driver.switchTo().defaultContent();
//		Searching "Incident"
		driver.findElementById("filter").sendKeys("incident");
//		Click "All" option
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[text()='All'])[2]").click();
		driver.switchTo().frame("gsft_main");
//		Tapping new button
		Thread.sleep(4000);
		driver.findElementById("sysverb_new").click();
//		Tapping search button
	    driver.findElementByXPath("//span[@class='icon icon-search']").click();
	    Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		String second=list.get(1);
		driver.switchTo().window(second);
		driver.findElementByLinkText("Abel Tuter").click();
		driver.switchTo().window(list.get(0));
		Thread.sleep(2000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Myself and Vimala will get placed within August 2021");
		String incNum= driver.findElementById("incident.number").getAttribute("value");
		System.out.println(incNum);
		Thread.sleep(2000);
		driver.findElementByXPath("(//button[@class='form_action_button  action_context btn btn-default'])[1]").click();
		driver.findElementByXPath("//div[@class='input-group']/input").sendKeys(incNum,Keys.ENTER);
	
boolean val= driver.findElementByXPath("//a[@class='linked formlink']").isDisplayed();
System.out.println(val);
	}
	
	
	
	
	
	
}
