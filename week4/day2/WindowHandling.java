package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		Getting URL
		driver.get("https://www.irctc.co.in/nget/train-search");
//		Tapping ok
	driver.findElementByXPath("//button[@class='btn btn-primary']").click();
//	Tapping menu button
	driver.findElementByXPath("//i[@class='fa fa-align-justify']").click();
//	Clicking flight option
	driver.findElementByXPath("//label[text()='FLIGHTS']").click();
//	Getting windows reference in set
	Set<String> set=driver.getWindowHandles();
//	Moving it into list to interact with each window
	List<String> list = new ArrayList<String>(set);
// Getting second window reference 
	String secWindow= list.get(1);
//	Moving controls to second window
	driver.switchTo().window(secWindow);
// Tapping Ok button
	driver.findElementByXPath("//button[text()='Ok']").click();
//	Getting Email ID
	String email= driver.findElementByXPath("//a[@class='d-block font-weight-bold']").getText();
//	Printing Email ID
	System.out.println("Customer support mail ID is= "+email);
//	Moving control to first window
	driver.switchTo().window(list.get(0));
//	Close first window
	driver.close();

	}
}
