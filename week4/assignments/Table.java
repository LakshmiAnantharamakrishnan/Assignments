package week4.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
//		Getting URL
		driver.get("http://leafground.com/pages/table.html");
//		Getting row count
	List<WebElement> row = driver.findElementsByXPath("//table[@id='table_id']//tr");
	System.out.println("No of rows= "+row.size());
//	Getting column count
	List<WebElement> column = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td");
	System.out.println("No of column= "+column.size());
	
//	Get the progess value
	
	String value =driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[3]").getText();
	System.out.println(value);
driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
	
	
		
	}
	}
	
	


