package week4.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
//		Getting URL
		driver.get("http://leafground.com/pages/Calendar.html");
//		Locating date picker box
		driver.findElementById("datepicker").click();
//		Locating Date
		driver.findElementByLinkText("10").click();
	}
	

}
