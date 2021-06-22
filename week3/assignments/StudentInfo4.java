package week3.assignments;

public class StudentInfo4 {
	public void getInfo(int a)
	{
		System.out.println("id value is "+a);
	}
	public void getInfo(int a,String name)
	{
		System.out.println("My Name is "+name+" and my id is "+a);
	}
	
	public void getInfo(String email,double number)
	{
		System.out.println("My Email ID is= "+email+" and my phone number is "+number);
	}
	
	public static void main(String[] args) {
		StudentInfo4 details=new  StudentInfo4();
		details.getInfo(13);
		details.getInfo(13, "Lakshmi");
		details.getInfo("laks@gmail.com",883808212);
		
	}

}
