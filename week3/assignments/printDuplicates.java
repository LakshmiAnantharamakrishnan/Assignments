package week3.assignments;



import java.util.HashSet;
import java.util.Set;



public class printDuplicates {
	public static void main(String[] args) {
		
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
	
	
//	Set1	
		Set<Integer> set1= new HashSet<Integer>();
//	Set 2
		Set<Integer> set2= new HashSet<Integer>();
//	Moving array values into a temp variable
		for (int arr : data) 
//	Set will not allow dupliactes so we are making a condition like if the values 
// the are not added in set1 then add those values in set2,so duplicate values
//  will not get added so it gets added in set 2
		if(!set1.add(arr))
		{
	 
		set2.add(arr);
	}
	System.out.println(set2);
}
}
	

