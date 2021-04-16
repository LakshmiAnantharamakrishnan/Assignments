package week1.day2;

public class SumOfDigitsStringAssignment {

	public static void main(String[] args) {
//		initializing a string
		String text = "Tes12Le79af55";
//		Initializing sum to add values
		int sum=0;
//		Changing string to character array
		char[] arr=text.toCharArray();
//		getting length of the array
		int len=arr.length;
//		checking each element
//		if condition for the checking the element is number or not
		for(int i=0;i<len;i++)
			if(Character.isDigit(arr[i]))
			
			{
//      getting value of it
		int val=Character.getNumericValue(arr[i]);
//		Adding it with sum
				sum=sum+val;
			}
		
		
System.out.println(sum);
	}

}
