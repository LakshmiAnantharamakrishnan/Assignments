package week7.assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			driver.get("https://www.ajio.com/shop/sale ");
			Thread.sleep(2000);
			driver.findElementByName("searchVal").sendKeys("Bags",Keys.ENTER);
			driver.findElementByXPath("//label[@for='Women']").click();
			driver.findElementByClassName("five-grid").click();
			Thread.sleep(2000);
		WebElement dd= driver.findElementByTagName("select");
			Select DropDown = new Select(dd);
			DropDown.selectByIndex(3);
			Thread.sleep(2000);
			driver.findElementByXPath("//span[text()='price']").click();
			Thread.sleep(2000);
			driver.findElementById("minPrice").sendKeys("2000");
			driver.findElementById("maxPrice").sendKeys("5000");
			driver.findElementByXPath("(//button[@type='submit'])[2]").click();
			driver.findElementByXPath("//img[contains(@class,'rilrtl-lazy-img ')]").click();
			Thread.sleep(2000);
			Set<String> set= driver.getWindowHandles();
//			Moving to list
			List<String> list = new ArrayList<String>(set);
//			Moving control to second window
			driver.switchTo().window(list.get(1));
			String actualPrice=driver.findElementByXPath("//span[text()='Rs. 15,700']").getText();
			System.out.println(actualPrice);

			String disPrice=driver.findElementByXPath("//div[@class='prod-sp']").getText();
			System.out.println(disPrice);

			String couponCode=driver.findElementByXPath("//div[@class='promo-title-blck']//div[1]").getText();
			System.out.println(couponCode);
			driver.findElementByXPath("//span[text()='Enter Pin-code To Know Estimated Delivery Date']").click();
			
			driver.findElementByClassName("edd-pincode-modal-text").sendKeys("560043");
			Thread.sleep(2000);
			driver.findElementByClassName("edd-pincode-modal-submit-btn").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//div[@class='other-info-toggle']").click();
			String edate= driver.findElementByXPath("//span[@class='edd-message-success-details-highlighted']").getText();
			System.out.println(edate);
			Thread.sleep(2000);
	
		driver.findElement(By.className("btn-gold")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		String select= driver.findElementByXPath("//span[@class='price-value bold-font']").getText();
		System.out.println(select);
		driver.findElementById("couponCodeInput").sendKeys(couponCode);
		driver.findElementByXPath("//button[text()='Apply']").click();
		String amount= driver.findElementByXPath("//span[@class='price-value bold-font']").getText();
		if(disPrice.equals(amount))
			System.out.println("price matched");
		else
			System.out.println("Price not matched");
		driver.findElementByClassName("delete-btn").click();
		driver.quit();
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}	

}
