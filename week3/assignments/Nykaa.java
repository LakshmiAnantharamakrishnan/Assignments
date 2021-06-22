package week3.assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		Getting the URL
	driver.get("https://www.nykaa.com/");
//	Creating list for getting string values of name and price
	List<String> perfumeName= new ArrayList<String>();
	List<String> priceValue= new ArrayList<String>();
//	Locating search button and searchign perfume
	driver.findElementByXPath("//input[@name='search-suggestions-nykaa']").sendKeys("Perfumes",Keys.ENTER);
	List<WebElement> name = driver.findElementsByXPath( "//div[@class='m-content__product-list__title']//span");
//getting the elements from webelements list and storing in temp and moving to list which is created for perfume names(String List)
	for(int i=0;i<name.size();i++)
{
	String temp=name.get(i).getText();
	perfumeName.add(temp);

	}
System.out.println(perfumeName);
List<WebElement> price = driver.findElementsByXPath("//span[@class='post-card__content-price-offer']");
//getting the elements from webelements list and storing in temp and moving to list which is created for perfume price(String List)
for(int j=0;j<price.size();j++)
{
//	as we get question mark for string we are replacing it with Hashcode
	String pr = price.get(j).getText().replaceAll("[^a-zA-Z0-9]", "");
	priceValue.add(pr);
}
System.out.println(priceValue);
//Clicking on preview shades
WebElement bag = driver.findElementByXPath("//span[text()='PREVIEW SHADES']");
executor.executeScript("arguments[0].click();", bag);
Thread.sleep(2000);
//Clicking on "Add to Bag"
WebElement add = driver.findElementByXPath("//button[text()='ADD TO BAG']");
executor.executeScript("arguments[0].click();", add);
Thread.sleep(5000);
//Searching for Sunglasses
		driver.findElementById("SearchInputBox").sendKeys("Sunglasses", Keys.ENTER);
//Creating list for getting string of sunglasses name

List<String> sunName= new ArrayList<String>();

List<WebElement> nameSun = driver.findElementsByXPath("//div[@class='m-content__product-list__title']//span");
for(int k=0;k<nameSun.size();k++)
{
String sunTemp= nameSun.get(k).getText();
sunName.add(sunTemp);

}
System.out.println(sunName);
WebElement add1 = driver.findElementByXPath("//button[text()='ADD TO BAG']");
executor.executeScript("arguments[0].click();", add1);	
WebElement bagg=driver.findElementByClassName("AddBagIcon");
executor.executeScript("arguments[0].click();", bagg);	
WebElement proceed= driver.findElementByXPath("//span[text()='Proceed']");
executor.executeScript("arguments[0].click();", proceed);	

}
	
	
}
