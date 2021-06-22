package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
//		Creating string array
		String[] arr= {"HCL","Wipro","CTS","Aspire systems"};
//		Converting string Array to List
		List<String> value= new ArrayList<String> ();
//		Storing it in temp variable and adding it to list
		for (String temp : arr) {
			value.add(temp);
//			sorting the list
			Collections.sort(value);
//			reversing the sorted order
			Collections.reverse(value);
		
			
		}

	System.out.println(value);
		}
	}
	


