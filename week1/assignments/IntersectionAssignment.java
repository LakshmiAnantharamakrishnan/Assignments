package week1.assignments;

public class IntersectionAssignment {

	public static void main(String[] args) {
	// Initializing arrays
		int[] a1={3,2,11,4,6,7};
		int[] a2={1,0,8,11,9,0};
		// Getting the length of it
		int len1=a1.length;
		int len2=a2.length;
		// Conditioning for intersection
		for(int i=0;i<=len1-1;i++)
		{
			for(int j=0;j<=len2-1;j++ )
			{
//				if for checking both the values are equal
				if(a1[i]==a2[j])
				{
					System.out.println(a1[i]);
					
				}
				
			}
	
		}
		
		
	}

}
