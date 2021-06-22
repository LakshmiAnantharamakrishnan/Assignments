package week3.assignments;

public class AxisBank3Child1 extends BankInfo3 {
	int initialvalue=30000;
	public void deposit()
	{
		System.out.println("deposit= "+initialvalue);
	}
	public static void main(String[] args) {
		AxisBank3Child1 obj=new AxisBank3Child1();
		obj.deposit();
		obj.saving();
		obj.fixed();
	}

}
