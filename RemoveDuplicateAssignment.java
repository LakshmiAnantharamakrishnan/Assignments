package week1.day2;

public class RemoveDuplicateAssignment {
	
	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";		
		int count=0;
//		Converting to string array
//		split function splits the string into words
		String[] arr = text.split(" ");
//		to store the words
		String newText=null;
		
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
//				".equals is used in string array for comparing strings
				if (arr[i].equals(arr[j])) {
					
					count=count+1;
			if(count>1)
			{
//				if the above condition is true arr[i] will get removed and new array gets saved in "newText" variable
				newText = text.replace(arr[i], "");
			}
			
		}
			
		
	}
		System.out.println(newText);
	}
	
}
