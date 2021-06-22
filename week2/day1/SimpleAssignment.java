package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
//	selecting options by "SelectByIndex Method
		
    	Select option1=new Select(driver.findElementById("dropdown1"));
     	option1.selectByIndex(1);
//    	selecting options by "SelectByVisibleText Method
		
		Select option2=new Select(driver.findElementByName("dropdown2"));
		option2.selectByVisibleText("Selenium");
//		selecting options by "SelectByValue Method
		
		Select option3=new Select(driver.findElementById("dropdown3"));
		option3.selectByValue("1");
//		Getting dropdown values and selecting options by "SelectByIndex Method
		
		Select option4=new Select(driver.findElementByClassName("dropdown"));
		List<WebElement> dd= option4.getOptions();
		int sizes=dd.size();
		System.out.println(sizes);
		int lastIndex=sizes-4;
		option4.selectByIndex(lastIndex);
//		selecting by sendKeys method- sendKeys is not a method in Select Class
		WebElement element=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select");
		element.sendKeys("Selenium");		
		WebElement element1=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[6]/select/option[2]");
		element1.sendKeys("Selenium");
		

	
		
	}

}