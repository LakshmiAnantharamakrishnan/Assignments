package testcase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;
	public String excelFileName;
	public static ExtentReports extent;
	 String author;
	 String category;
	 String testname;
	 String description;
public static ExtentTest test,node;

public int takeSnap() throws IOException
{
	int ranNum= (int)(Math.random() *9999);
	File source= driver.getScreenshotAs(OutputType.FILE);
	File target= new File("./snaps/img"+ranNum+".png");
	FileUtils.copyFile(source, target);
	return ranNum;
}
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	 public void preCondition(String url,String uname,String pwd)
	 {
		node=test.createNode(testname);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
	 }
	
	@AfterMethod
	 public void postCondition()
	 {
		driver.close();
	 }
	@DataProvider
	public String[][] sendData() throws IOException {
		ReadExcel re= new ReadExcel();
		String[][] excelDataa= re.excelData(excelFileName);
		return excelDataa  ;
	}	
	
	@BeforeSuite
	public void startReport()
	{
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("./reports/result.html");
		 extent= new ExtentReports();
		 extent.attachReporter(reporter);
	}
	@AfterSuite
	public void endReport()
	{
		extent.flush();
	}
	@BeforeClass
	public void testDetails()
	{
		 test=extent.createTest(testname,description);
		test.assignCategory(category);
		test.assignAuthor(author);
	
		
	}
	public void reportStep(String stepname,String status) throws IOException
	{
		if(status.equalsIgnoreCase("pass"))
		{
			node.pass(stepname,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}
		
		else if (status.equalsIgnoreCase("fail"))
		{
			node.fail(stepname);
			throw new RuntimeException();
		}
		}
	
}