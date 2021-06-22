package week3.assignments;

public class Student2Child2 extends Department2Child1

{
public void studentName()
{
	System.out.println("My Name is Lakshmi");
}
public void studentDept()
{
	System.out.println("i belong to ECE-A");
}
public void studentId()
{
	System.out.println("My ID Number is =160897");
}
public static void main(String[] args) {
	Student2Child2 obj=new Student2Child2();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
	obj.deptName();
	obj.studentName();
	obj.studentDept();
	obj.studentId();
	
}
}


