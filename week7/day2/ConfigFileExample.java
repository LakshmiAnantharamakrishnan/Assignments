package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigFileExample {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("./src/main/resources/config.properties");
		
		
		Properties prop= new Properties();
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));

	
		driver.manage().window().maximize();

		
		WebElement username=driver.findElementByXPath("//input[@id='username']");
		username.sendKeys(prop.getProperty("username"));

		// directly using sendkeys in method
		driver.findElementByXPath("//input[@id='password']").sendKeys(prop.getProperty("password"));
		
		
	}

}
