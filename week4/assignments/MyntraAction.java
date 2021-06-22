package week4.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraAction {
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		Getting URL
		driver.get("https://www.myntra.com/");
		WebElement women=driver.findElementByXPath("(//a[@class='desktop-main'])[2]");
//		Using Actions class to hover on elements
		Actions builder= new Actions(driver);
		builder.moveToElement(women).perform();
//		Clicking Jackets&coats
		driver.findElementByLinkText("Jackets & Coats").click();
//		Getting the text in string and replacing everything other than numbers
		String count= driver.findElementByClassName("title-count").getText().replaceAll("[^0-9]", "");
		System.out.println(count);
//		Converting String to Number
		int total = Integer.parseInt(count);
//		Getting the text in string and replacing everything other than numbers
		String jacket =driver.findElementByClassName("categories-num").getText().replaceAll("[^0-9]", "");
//		Converting String to Number
		int jacky=	Integer.parseInt(jacket);
		System.out.println(jacky);
		Thread.sleep(2000);
//		Getting total value and replacing everything other than numbers
		String coat =driver.findElementByXPath("(//label[@class='common-customCheckbox vertical-filters-label'])[2]").getText().replaceAll("[^0-9]", "");
		int coaty= Integer.parseInt(coat);
		System.out.println(coaty);
//		Adding jackets and coats value
		int jaccot = jacky+coaty;
		System.out.println(jaccot);
//		Conditioning for checking count is equal or not
		if(total==jaccot)
		{
		System.out.println("Count is equal");
		}
		else
		{
		System.out.println("count is not equal");
	}
//		Clicking coat button
		driver.findElementByXPath("(//label[@class='common-customCheckbox vertical-filters-label'])[2]").click();
//      Tapping +More button on brands
		driver.findElementByClassName("brand-more").click();
//		Entering Mango and searching it
		driver.findElementByClassName("FilterDirectory-searchInput").sendKeys("MANGO");
//		Clicking Mango check button
		driver.findElementByXPath("//span[@class='FilterDirectory-count']/following-sibling::div[1]").click();
		Thread.sleep(2000);
//	    Closing pop up By Tapping "X"
		driver.findElementByXPath("//span[contains(@class,'myntraweb-sprite FilterDirectory-close')]").click();
//	    Getting brand names in list
		List<String> list= new ArrayList<String>();
//		Getting webelements in list
		List<WebElement>  brand= driver.findElementsByXPath("//h3[@class='product-brand']");
//		Moving to temp webelement for getting string from each web element
		for (WebElement bname : brand) 
		{
//			storing it in string
		String name=	bname.getText();
//		Moving string values into list
		list.add(name);
		}
//		Printing the list
		System.out.println(list);
//		tapping sort by using actions class
		WebElement sort = driver.findElementByClassName("sort-sortBy");
		builder.moveToElement(sort).perform();
//		selecting better discount
		Thread.sleep(2000);
		driver.findElementByXPath("//label[text()='Better Discount']").click();
//		Getting Price
		Thread.sleep(2000);
		WebElement size1 = driver.findElementByXPath("//span[@class='product-discountedPrice']");
		
		builder.moveToElement(size1).perform();	
	//getting price of product one
		String price=driver.findElementByXPath("//span[@class='product-discountedPrice']").getText();
		System.out.println("The price" +price);
		//Mousehover on size
		WebElement size = driver.findElementByXPath("//span[@class='product-sizeNoInventoryPresent']");
		builder.moveToElement(size).perform();	
		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='wishlist']").click();
	
	}
}

