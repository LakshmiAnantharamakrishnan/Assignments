package week3.day2;

public class College extends University {

	@Override
	public void ug() {
		System.out.println("Iam a UG Graduate");
		
	}
	public static void main(String[] args) {
		College obj=new College();
		obj.pg();
		obj.ug();
	}

}
