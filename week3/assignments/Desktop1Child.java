package week3.assignments;

public class Desktop1Child extends Computer1
{
	public void desktopSize(int a,int b)
	{
		System.out.println("i belong to the product type Dell");
		System.out.println("My Size is "+(a*b));
		
	}
public static void main(String[] args) {
	Desktop1Child obj=new Desktop1Child();
	obj.model(5, 5);
	obj.desktopSize(6, 5);
	
}
}
