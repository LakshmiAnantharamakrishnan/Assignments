package week1.assignments;

import java.util.Arrays;

public class MissingElementArrayAssignment {

	public static void main(String[] args) {
//		initializing Array
		int[] array = {1,2,7,4,5,6,8};
//		Finding length of the Array
		int len=array.length;
//		Sorting the Array
		Arrays.sort(array);
//		Checking the i value with the data present in array[i]
//		if i=1 and content in array[1] is equal then element is present
//		since array index starts from 0 we are using[i-1] to match the value
//		if i=1 then i will be checked with array[i-1] i.e data present in array[0]
		
		for(int i=1;i<=len;i++)
		{
//			if there is no match then the value will be printed
			if(i!=array[i-1])
			
			{
			System.out.println(i);	
			break;
			}
			
		}
		
		
		

	}

}
