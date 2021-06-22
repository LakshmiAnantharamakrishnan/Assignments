package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectItems {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		Getting URL
		driver.get("http://leafground.com/pages/selectable.html");
//		Storing and locating weblelements to be selected
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
//		Creating object for "Actions" class and passing driver through it
		Actions builder=new Actions(driver);
//		Key down method to select options
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).perform();
	}

}
