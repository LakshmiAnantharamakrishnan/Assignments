package week1.day1;




public class Variable {
//	Declaring Global Variables
	 String mobileModel="Samsung";
	int mobileWeight=10;
   	boolean fullCharge=true;
	double mobileCost=55500.76;
	
	public static void main(String[] args)
	{
//		Creating a object
		Variable spec= new Variable();
//		Calling Method
		spec.cost();
		spec.model();
//		Creating a Local Variable and printing using a Local Variable
		String ModelOfPhone= spec.mobileModel;
		System.out.println(ModelOfPhone);
//		Calling a variable using object
		System.out.println(spec.fullCharge);
		
		
		
	}
//		creating method
		public void cost()
		{
			int marketValue=50000;
			System.out.println(marketValue);
			
			System.out.println("getting cost data");
//			we cannot store Global variable in an local variable in a normal method
		System.out.println(mobileCost);
		
		}
//	creating method
		public void model() {
			System.out.println("getting model data");
			System.out.println();
		}
}
