package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondAssignment {
	public static void main(String[] args) throws InterruptedException {
//		setting up chrome driver
		WebDriverManager.chromedriver().setup();
//		creating object for chromedriver class
		ChromeDriver driver=new ChromeDriver();
//		Getting and Loading URL
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementByXPath("/html/body/div/div[2]/div/div/div/form/button").click();
//		Getting the title and printing it 
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("Log Out").click();
		Thread.sleep(2000);
		driver.close();
		
	}

}