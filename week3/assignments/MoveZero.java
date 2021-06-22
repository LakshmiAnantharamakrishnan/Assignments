package week3.assignments;

public class MoveZero {
	public static void main(String[] args) {
		int[] arr = {4,0,3,0,1,5,2,0};
	int len=arr.length;
	int count=0;
	
	for(int i=0;i<len;i++)
	{
//	to check the value present in index is not equal to zero ,if it is not equal to zero increment the index value
			arr[count++]=arr[i];
		
	}
//	After incrementing count for Non zero values now increment the count to len and assign zero to it
	while(count<len)

	{
		arr[count++]=0;
	}
//	print array values by iterating through it
for(int j=0;j<len;j++)
{
	System.out.print(arr[j]);
}
}
}
