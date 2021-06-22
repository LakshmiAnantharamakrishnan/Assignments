package TestSample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WithoutClass  {
	
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Second before suite");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Second After suite");
	}
	@Test
	public void test1()
	{
		System.out.println("Test2");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("second AfterClass");
	}
	@AfterTest
	public void afterTesttt()
	{
		System.out.println("second AfterTest");
	}
	
	
	
}
