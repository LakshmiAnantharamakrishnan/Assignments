package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowExample {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		Getting URL
		driver.get("http://leafground.com/pages/Window.html");
//		Locating Home
		driver.findElementById("home").click();
//		Getting Windows reference
		Set<String> set= driver.getWindowHandles();
//		Moving to list
		List<String> list = new ArrayList<String>(set);
//		Moving control to second window
		driver.switchTo().window(list.get(1));
//		Tapping on button icon
		driver.findElementByXPath("(//img[@class='wp-categories-icon svg-image'])[2]").click();
//		Moving control window to first window
		driver.switchTo().window(list.get(0));
		System.out.println("closed");
//		Close the window
		driver.close();
	} 

}
