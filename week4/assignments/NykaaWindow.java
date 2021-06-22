package week4.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
//		Getting URL
		driver.get("https://www.nykaa.com/");
//		Mouseover on brands and Mouseover by popular
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		WebElement brand= driver.findElementByXPath("(//a[@href='#'])[2]");
		builder.moveToElement(brand).perform();
		Thread.sleep(3000);
		WebElement popular = driver.findElementByXPath("//*[@id=\"headerMenu\"]/ul[1]/li[2]/ul/li/section[2]/div[1]/a[1]");
		builder.moveToElement(popular).perform();
//		Clicking on Loreal Paris
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"brandCont_Popular\"]/ul/li[5]/a/img").click();;
//      Getting windows reference in set   
		Set<String> set= driver.getWindowHandles();
//		Moving to List
	    List<String> list = new ArrayList<String>(set);
//	    Moving control to second window
	    driver.switchTo().window(list.get(1));
	    Thread.sleep(2000);
	    String heading = driver.findElementByClassName("heading--fancy").getText();
	    System.out.println(heading);
	  //5) Click sort By and select customer top rated
//	    driver.findElementByXPath("//span[@title='POPULARITY']");
//	    Thread.sleep(2000);
//	    driver.findElementByXPath("//span[text()='customer top rated']");
//	    Category selection
	    Thread.sleep(4000);
	  //Clicking category
	  WebElement category=  driver.findElementByXPath("//div[text()='Category']");
	  executor.executeScript("arguments[0].click();",category );
	    Thread.sleep(2000);
	    //Clicking hair
	    driver.findElementByXPath("//div[@class='category-wrap-top']//li").click();
	    Thread.sleep(2000);
	 driver.findElementByXPath("//span[text()='Hair Care']").click();
	 Thread.sleep(2000);
	 driver.findElementByXPath("//div[@class='control__indicator']").click();
	 Thread.sleep(2000);
	 WebElement color=driver.findElementByXPath("//*[@id=\"listingContainer\"]/div[3]/div/div/div[2]/div/div/div[11]/div/a/div/div[2]/div[1]/h2/span");
	 executor.executeScript("arguments[0].click();",color );
	 Set<String> shampoo= driver.getWindowHandles();
	 Thread.sleep(2000);
	 List<String> shamp= new ArrayList<String>(shampoo);
	 Thread.sleep(2000);
	 driver.switchTo().window(shamp.get(2));
	 driver.findElementByXPath("//span[text()='175ml']").click();
	 String price= driver.findElementByXPath("//span[text()='135']").getText().replaceAll("\\u20B9\"", "");
	 System.out.println(price);
	 Thread.sleep(2000);
	 driver.findElementByXPath("//button[contains(@class,'combo-add-to-btn prdt-des-btn')]").click();
	 Thread.sleep(2000);
	 driver.findElementByClassName("AddBagIcon").click();
	 Thread.sleep(2000);
	String gt= driver.findElementByClassName("value medium-strong").getText();
	System.out.println(gt);
	WebElement proceed= driver.findElementByXPath("//span[text()='Proceed']");
	executor.executeScript("arguments[0].click();", proceed);	
	
	 

	
	
	
	}


}
