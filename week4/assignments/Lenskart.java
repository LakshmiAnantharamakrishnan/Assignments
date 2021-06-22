package week4.assignments;



import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lenskart {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
//		Getting URL
		driver.get(" https://www.lenskart.com");
WebElement cglasses= driver.findElementByLinkText("Computer Glasses");
Actions builder= new Actions(driver);
builder.moveToElement(cglasses).perform();
WebElement men= driver.findElementByXPath("(//span[text()='men'])[2]");
builder.moveToElement(men).perform();
Thread.sleep(2000);
driver.findElementByXPath("//span[text()='PREMIUM RANGE']").click();
//4. Click Round(Frame Shape)
Thread.sleep(2000);
driver.findElementByXPath("//img[@data-title='11346']").click();
Thread.sleep(2000);
//Locating and selecting More Filters
driver.findElementByXPath("//span[text()='MORE FILTERS']").click();
Thread.sleep(2000);
//Locating and selecting Frame color with Highest count
driver.findElementByXPath("//span[text()='Black(12)']").click();
Thread.sleep(2000);
//Locating and selecting the text present
String count= driver.findElementByClassName("show_count").getText();
System.out.println(count);
// Checking if it has the count
if(count.contains("12"))
{
	System.out.println("Value is equal");
}
else
{

System.out.println("Value is not equal");
		
	}
//Locating the first item
WebElement size= driver.findElementByXPath("//a[contains(@class,'no-decoration display-block')]//div");
builder.moveToElement(size).perform();
//Locating and printing the size of the element
String sizes=driver.findElementByXPath("//span[text()='Medium']").getText();
	System.out.println(sizes);
	}
}
