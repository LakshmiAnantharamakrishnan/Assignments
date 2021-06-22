package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPhone {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElementById("twotabsearchtextbox").sendKeys("Redmi mobiles");
		driver.findElementById("nav-search-submit-button").click();
		
		// concad is used because "i" alone will be considered as string so we have to concad to pass the value i*/
				 
		List<String> mobileName= new ArrayList<String>();
List<WebElement> element = driver
					.findElementsByXPath("//span[contains(@class,'a-size-medium a-color-base')]");
			//passing the elements in the list
			 
			
			for (int i = 0; i < element.size(); i++) 
				
			{
				String name=element.get(i).getText();
				mobileName.add(name);
				
			}
			System.out.println(mobileName);
			List mobilePrice = new ArrayList();
			
			List<WebElement> element1 = driver
					.findElementsByXPath("//span[@class='a-price-whole']");
			 
			
			for (int j = 0; j < element1.size(); j++) 
				
			{
				String price=element1.get(j).getText().replaceAll("\\s+", "");
				int val= Integer.parseInt(price);
				mobilePrice.add(val);
				
			}
			System.out.println(mobilePrice);	
			System.out.println(mobilePrice.size());
		
		
			
			
			
			
			
			
			
			
	}	
	

	}


