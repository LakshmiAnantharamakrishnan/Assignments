package week1.assignments;

public class SumOfDigitsAssignment {

	public static void main(String[] args) {
//		initializing variables
		int input=123;
		int sum = 0;
		
//	/setting input condition
		while(input>0)
		{
//			getting reminder value
			int rem=input%10;
//			storing reminder value in sum and adding it with future reminders- 3+2+1
			sum=0;
			sum=sum+rem;
//			Assiging quotient value to input in order to get reminder
			int quotient=input/10;
			input=quotient;
	
		}
		System.out.println("Sum of the number 123 is"+sum);
	}

}
