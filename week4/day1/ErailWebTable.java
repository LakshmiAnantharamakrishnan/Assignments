package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailWebTable {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Getting URL
		driver.get("https://erail.in/");
//		Locate and Clear Source
	driver.findElementById("txtStationFrom").clear();
	driver.findElementById("txtStationFrom").sendKeys("MS",Keys.ENTER);
//  Locate and clear destination 
	driver.findElementById("txtStationTo").clear();	
	
	driver.findElementById("txtStationTo").sendKeys("MDU",Keys.ENTER);
//	de select sort by date
	driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
//	Getting the trainlist 
List<WebElement> trains = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
	int count = trains.size();
//	creating a string list to get the names of train
	List<String> tnames= new ArrayList<String>();
//	iterating to get the name
for(int i=1;i<=count;i++)
{
//	Getting the trainname in string
	
String trainName = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();

// Adding train names to trainname list
tnames.add(trainName);
}
//Copying the train name into set to compare for duplicates..if both the size is same then there is no duplicates
Set<String> set=new LinkedHashSet<String>(tnames);
if(tnames.size()==set.size())
{

System.out.println("no duplicates");
}
else
	System.out.println("duplicated");
	
	
	}

	}


