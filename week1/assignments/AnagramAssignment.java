package week1.assignments;

import java.util.Arrays;

public class AnagramAssignment {
	public static void main(String[] args) {
//		Initializing strings
		String t1="doggh";
		String t2="potss";
//		checking the length of Strings
		int len1=t1.length();
		
		int len2=t2.length();
//		Comparing length of Strings (if equal goes inside the loop,if not exits the loop)
		if(len1==len2)
		{
//			Converting character to Array
			char[] ch1=t1.toCharArray();
		
			char[] ch2=t2.toCharArray();
//			Sorting the Array
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			
			
			if(Arrays.equals(ch1, ch2))
			{
					
	
			System.out.println("it is Anagram");
			
		}
		}
		else
		{
			System.out.println("it is not a anagram");
		}
		System.out.println("it is not a anagram");
		}	
		
		
	}
	

