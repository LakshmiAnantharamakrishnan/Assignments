package week7.day1;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitTextToChange {
	
		public static void main(String[] args) throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://www.leafground.com/pages/TextChange.html");
		
			WebElement element= driver.findElementById("btn");
			
				
				WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//				wait.until(ExpectedConditions.textToBePresentInElementValue(element,"Click ME!"));
				wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("btn"), "Click ME!"));
				

				element.click();
				Thread.sleep(2000);
		
			Alert alert= driver.switchTo().alert();
			Thread.sleep(2000);
			System.out.println(alert.getText());
			alert.accept();
			
		
			
			
		}
}
