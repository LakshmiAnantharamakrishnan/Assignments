package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;





public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String input="PayPal India";
	char[] arr=input.toCharArray();
	Set<Character> charSet=new LinkedHashSet<Character> ();

	
	for (char tempSet : arr) 
		charSet.add(tempSet);
		for (char ch : charSet) 
			if (ch != ' ')
			{
				System.out.print(ch);	
			}
				
			
		
			
			
			
		
		
		
			
			
			

	
//	System.out.print(val);
	}
}
