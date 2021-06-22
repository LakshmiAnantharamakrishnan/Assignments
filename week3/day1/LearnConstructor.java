package week3.day1;

public class LearnConstructor {

	int id;
	String name;
	boolean value;
//	default constructor
	LearnConstructor()
	{
		System.out.println("This is a default construcor");
	}
//	parameterized constructor
	LearnConstructor(int id,String name,boolean value)
	{
//		Calling one constructor from another constructor using "This" keyword
		this();
//		Assigning values to Global variables by passing it in local variables
		this.id=id;
		this.name=name;
		this.value=value;
//	    Printing local variables value by calling the constructor and passign values	
		System.out.println(name);
		System.out.println(value);
		System.out.println(id);
//	Creating method	
	}
	public void details()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(value);
	}
	public static void main(String[] args) {
//		creating object and calling method using constructors
		LearnConstructor obj= new LearnConstructor(100,"Lakshmi",true);
		obj.details();
		
	}
	
}
