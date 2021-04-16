package week1.day1;

public class FibonacciAssignment {
	public static void main(String[] args) {
//	initializing the variables 
		int range=10,firstNum=0,secondNum=1,sum;
	
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(int i=3;i<=range;i++)
		{
//	Adding num1 and num2 and storing it in num3(sum)
		sum=firstNum+secondNum;
//	assigning num2 value to num1
		firstNum=secondNum;
//	assigning sum value to num2
		secondNum=sum;
		System.out.println(sum);
		}

	
		
	}

}
