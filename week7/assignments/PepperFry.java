package week7.assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PepperFry {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		driver.get("https://www.pepperfry.com/");
		Thread.sleep(2000);
		Actions action= new Actions(driver);
		WebElement furniture= driver.findElementByLinkText("Furniture");
		action.moveToElement(furniture).perform();
	Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		WebElement exeChair=driver.findElement(By.linkText("Office Chairs"));
		
		executor.executeScript("arguments[0].click();",exeChair );
		driver.findElement(By.xpath("//h5[text()='Executive Chairs']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).clear();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("50",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"clip_wishlist_1888861\"]").click();
		WebElement Bedroom= driver.findElementByLinkText("Bedroom");
		action.moveToElement(Bedroom).perform();
		Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		WebElement study=driver.findElement(By.xpath("(//a[@class='hvr-col-listitem-link' and text()='Study Tables'])[1]"));
		executor.executeScript("arguments[0].click();",study );
		WebElement space=driver.findElementByXPath("//label[@for='brandsnameSpacewood']");
		executor.executeScript("arguments[0].click();",space );
		Thread.sleep(2000);
		WebElement price=driver.findElementByXPath("(//input[@data-key='price']/following-sibling::label)[2]");
		executor.executeScript("arguments[0].click();",price );
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@data-productname='SOS Carter Study Table in Lorraine walnut & silver grey Finish']").click();
		WebElement wishlist= driver.findElementByXPath("//a[@class='wishlist_bar']//span");
		System.out.println(wishlist.getText());
		Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		executor.executeScript("arguments[0].click();",wishlist );
		WebElement cart= driver.findElementByClassName("addtocart_icon");
		executor.executeScript("arguments[0].click();",cart );
		options.addArguments("--disable-notifications");
	Thread.sleep(2000);
	WebElement pay=driver.findElementByClassName("proceed_cta");
		executor.executeScript("arguments[0].click();",pay );
		Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		driver.findElementById("pin_code").sendKeys("600028");
		WebElement check=driver.findElementById("pin_check");
		executor.executeScript("arguments[0].click();",check );
		Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		WebElement order=driver.findElementByXPath("//a[@data-isloader='1']");
		Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		executor.executeScript("arguments[0].click();",order );
		File source =driver.getScreenshotAs(OutputType.FILE);
		File target= new File("./snaps/ss.png");
		FileUtils.copyFile(source, target);
		driver.close();
		
	}

}
