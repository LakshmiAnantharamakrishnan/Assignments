package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealAUI {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver= new ChromeDriver(options);
	driver.get("https://www.snapdeal.com/");
	WebElement men= driver.findElementByXPath("//div[@id='leftNavMenuRevamp']/div[1]/div[2]/ul[1]/li[7]/a[1]/span[1]");
	Actions builder=new Actions(driver);
	builder.moveToElement(men).click().perform();
	Thread.sleep(2000);
	driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
	WebElement shirt= driver.findElementByXPath("//p[@class='product-title']");
	builder.moveToElement(shirt).click().perform();
	Thread.sleep(2000);
	WebElement quick=driver.findElementByXPath("//div[contains(@class,'center quick-view-bar')]");
	quick.click();
}

}
