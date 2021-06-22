package testcase;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void filename()
	{
	 excelFileName = "CreateLead";
	testname="createLead";
	description="creating a new lead";
	author="Lakshmi";
	category="fucntional";
	
	
	 
	}
	
	
@Test(dataProvider="sendData")
	public  void runCreateLead(String cname,String fname,String lname) throws IOException {
		
		try {
			driver.findElement(By.linkText("Create Lead")).click();
			reportStep("createlead tapped succesfully","pass");
		} catch (Exception e) {
			reportStep("unable to tap createlead link","fail");
			
		}
		
		try {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			reportStep("company name given successfully","pass");
		} catch (Exception e) {
			reportStep("unable to give company name ","fail");
			
		}
		
		try {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			reportStep("first name given successfully","pass");
		} catch (Exception e) {
			reportStep("unable to give first name ","fail");
			
		}
		
		try {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			reportStep("last name given successfully","pass");
		} catch (Exception e) {
			reportStep("unable to give last name ","fail");
			
		}
		
		try {
			driver.findElement(By.name("submitButton")).click();
			
			reportStep("submit button tapped  successfully","pass");
		} catch (Exception e) {
			reportStep("unable to tap submit button ","fail");
			
		}
		
		
		
		
		
	
}



	
	
	
	
	

}






