package week1.day2;

public class DuplicateInArray {
	public static void main(String[] args)
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
//		 length is a property to get the length of an array
//		storing length of array in "len"
		
	int len=arr.length;
	
	int count=0;
	for(int i=0;i<len;i++)
	{
		
		for(int j=i+1;j<len;j++)
		{
			if(arr[i]==arr[j]) 
			{
				count=count+1;
			
		}
		}
		if(count>0)
		{
			System.out.println(arr[i]);
		}
	
	}

	}  
}

