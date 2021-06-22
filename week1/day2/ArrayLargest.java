package week1.day2;

import java.util.Arrays;

public class ArrayLargest {
	
	public static void main(String[] args) {
//		Initializing an array
		int[] data= {3,2,11,4,6,7};
//
		int len=data.length	;
//		using Arrays class for sorting it
		Arrays.sort (data);
//		Arrays class will overwrite the value in Ascending order so data[1] will have second highest number
		System.out.println(data[4]);
//	storing second largest index in "largest' variable	
	int largest= len-2;
//	printing the second largest data using Array method
	System.out.println(data[largest]);
	}

}
