package TestSample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WithClass  {
	
	

	@BeforeClass
	public  void beforeClass() 
	{
		
		System.out.println("first beforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("First AfterClass");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test1");
	}
	@AfterTest
	public void afterTestt()
	{
		System.out.println("First AfterTest");
	}
	
	
}
