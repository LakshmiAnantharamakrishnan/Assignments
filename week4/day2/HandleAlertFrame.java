package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertFrame {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		Getting URL
		driver.get(" https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
//		switching to frame from main page
		driver.switchTo().frame("iframeResult");
//		locating try it button
		driver.findElementByXPath("//button[text()='Try it']").click();
//		Switching to Alert from main page
		Alert alert= driver.switchTo().alert();
//		entering text
		alert.sendKeys("Lakshmi");
//		pressing ok
		alert.accept();
//		Using get.PageSource() method to check the element present in DOM  matches the given value
		if(driver.getPageSource().contains("Lakshmi")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
	}

}
