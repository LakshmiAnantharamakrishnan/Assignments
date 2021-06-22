package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException  {
//		Setting up the driver

WebDriverManager.chromedriver().setup();
//Creating a object for ChromeDriver class
ChromeDriver driver=new ChromeDriver();

// Getting the URL and load the application
driver.get("http://leaftaps.com/opentaps/control/main");

//Maximizing the window
driver.manage().window().maximize();

//java wait method to wait for two seconds
Thread.sleep(2000);

// Creating variables for storing web elements(Control+2 press together and release and press "L"
WebElement username=driver.findElementById("username");
username.sendKeys("Demosalesmanager");

// directly using sendkeys in method
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
driver.findElementById("createLeadForm_firstName").sendKeys("Lakshmi");
driver.findElementById("createLeadForm_lastName").sendKeys("Anantharamakrishnan");


WebElement source=driver.findElementById("createLeadForm_dataSourceId");
//For dropdown-use select class so we have to create a object for select class
Select dropDown=new Select(source);
// to get the options in dropdown list
List<WebElement> options=dropDown.getOptions();
//Getting the size of dropdown list and storing it in variable
int size=options.size();
int lastIndex=size-1;
dropDown.selectByIndex(lastIndex);
driver.findElementByClassName("smallSubmit").click();

	}

}
