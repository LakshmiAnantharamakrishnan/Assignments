package week1.assignments;

public class OddToUpperCaseAssignment {
	public static void main(String[] args)
	{
		String text = "changeme";
//		Changing string to character array
		char[] arr=text.toCharArray();
//		Getting length of the array
		int len=arr.length;
//		looping for checking all the indexes
		for(int i=0;i<len;i++)
		{
//			condition of checking odd index
		if(i%2!=0)
			
		{
//	changing the character in the ndex to uppercase -using "character.touppercase" method
  System.out.print(Character.toUpperCase(arr[i]));
	
}
		else
		{
			System.out.print(arr[i]);
		}
		}
}

	


}
