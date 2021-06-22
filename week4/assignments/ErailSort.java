package week4.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {


		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
//			Getting URL
			driver.get("https://erail.in/");
//			Locate and Clear Source
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.ENTER);
	//  Locate and clear destination 
		driver.findElementById("txtStationTo").clear();	
		
		driver.findElementById("txtStationTo").sendKeys("MDU",Keys.ENTER);
//		de select sort by date
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
//		Getting the trainlist 
	List<WebElement> trains = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int count = trains.size();
//		creating a string list to get the names of train
		List<String> tnames= new ArrayList<String>();
//		iterating to get the name
	for(int i=1;i<=count;i++)
	{
//		Getting the trainname in string
		
	String trainName = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();

	// Adding train names to trainname list
	tnames.add(trainName);
	Collections.sort(tnames);
	
	}
	System.out.println(tnames);
		}
}
