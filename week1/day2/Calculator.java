package week1.day2;

public class Calculator {
//	creating a method sum

public int sum(int a,int b) 
{
	int add=a+b;
	System.out.println(add);
//	Returning Add value to main method
	return add ;
	
//	creating a method sub
}
public double sub(double c,double d) {

	double subValue=c-d;
//	Returning subValue  to main method
	return subValue ;

}
//creating a method mul
public double mul(double e,double f) {
	
	double mulValue=e*f;
//	Returning mulvalue  to main method
	return mulValue ;
}
//creating a method sub
public int div(int g,int h) 
{
	int divValue=g/h;
	
//	Returning divValue  to main method
//	Getting output from method
	System.out.println(divValue);
	return divValue ;
	

}
public static void main(String[] args) {
//	creating a object to call methods
	Calculator maths=new Calculator();
//	Printing the value by passing value to the method
//	Storing the returned value in local variable and printing it
//	add value will be printed twice since it is printed in method and main method
	int addition=maths.sum(5, 8);
	System.out.println(addition);
//	Printing the value by passing value to the method
	System.out.println(maths.sub(10.5, 5.5));
	System.out.println(maths.mul(5.5, 5.5));
	
	int divAnswer=maths.div(6,2);
//	divAnswer will be printed twice since it is printed in method and main method
	System.out.println(divAnswer);
	
	
}
}
