package week1.day2;

public class Armstrong {

	public static void main(String[] args) {
//	Armstrong=(1*1*1+5*5*5+3*3*3)=153  sum of cubes of each number should be same as the number	
int input=153; 
// original is used to save the input as input will change ,to compare with original input we save it in original
int sum=0,reminder,original;
original=input;
while(input>0)
{
//	153/10 reminder will be 3 saved in reminder
reminder=input%10;
sum=sum+reminder*reminder*reminder;
// quotient will be 15 saved in input since 3 is already added to sum
input=input/10;
	}
if(sum==original)
{
	System.out.println("Number is armstrong");
}
else
{
	System.out.println("Number is not armstrong");
}
}

}