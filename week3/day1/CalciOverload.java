package week3.day1;

public class CalciOverload {
	
	public void add(int a,int b)
	{
System.out.println("added value= "+(a+b));
	}
	
	public void add(int c,int d,int e)
	{
		System.out.println("added value= "+(c+d+e));		
	}
	public void mul(int f,int g)
	{
		System.out.println("Multiplied value is "+(f*g));
	}
	public void mul(int h,double i)
	{
		System.out.println("Multiplied value is "+(h*i));
	}
	public void sub(int j,int k)
	{
		System.out.println("subracted value is "+(j-k));
	}
	public void sub(double l,double m)
	{
		System.out.println("subracted value is "+(l-m));
	}
	
	public void div(int a,int b)
	{
		System.out.println("divided value is "+(a/b));
	}
	public void div(int h,double i)
	{
		System.out.println("divided value is "+(h/i));
	}
	public static void main(String[] args) {
		CalciOverload obj=new CalciOverload();
		obj.add(1,2,2);
		obj.add(1,1);
		obj.sub(10,6);
		obj.sub(7.5,0.5);
		obj.mul(3,3);
		obj.mul(3,0.1);
		obj.div(10,5);
		obj.div(10,0.5);
	}
	
	
	
}
