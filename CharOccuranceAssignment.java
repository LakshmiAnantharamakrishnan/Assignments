package week1.day2;

public class CharOccuranceAssignment {

	public static void main(String[] args) {
		String t1="welcome to chennai";
//		Initializing count for printing the occurrence number
		int count=0;
//		converting string to character array-"C1"
		char[] c1=t1.toCharArray();
//		Getting length of the array
		int len1=c1.length;
//		looping to check the value present in array matches letter"E"
		for(int i=0;i<=len1-1;i++)
		{
		if(c1[i]=='e')
		{
//			incrementing count when E is found
		count=count+1;
		}
		
	}
		System.out.println("Number of times letter E present in the string is="+count);
}
}
