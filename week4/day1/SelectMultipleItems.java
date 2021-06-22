package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultipleItems {

	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
//			Getting URL
			driver.get("http://leafground.com/pages/Dropdown.html");
			
		WebElement one=	driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option");
		WebElement two=	driver.findElementByXPath("//div[@id='contentblock']/section[1]/div[6]/select[1]/option[3]");
		WebElement three=	driver.findElementByXPath("//div[@id='contentblock']/section[1]/div[6]/select[1]/option[4]");
	Actions builder= new Actions(driver);
	builder.clickAndHold(one).moveToElement(three).release().perform();
		
		
		}

}
