package testcase;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class ReRun {
	@Test
	public void create()
	{
		System.out.println("Create");
	}
	@Test
	public void edit()
	{
		System.out.println("edit");
	}
	@Test
	public void delete()
	{
		System.out.println("delete");
	}
	@Test
	public void duplicate()
	{
		System.out.println("duplicate");
	}
	@Test
	public void merge()
	{
		System.out.println("merge");
		throw new  NoSuchElementException();
		
		
	}
}
