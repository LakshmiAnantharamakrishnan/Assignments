package week3.day1;

public class ChildOveride extends PhoneOveride {
	@Override
	public void takevideos() {
		
		System.out.println("taking video in child phone");
	}

	public static void main(String[] args) {
		ChildOveride obj=new ChildOveride();
		obj.takevideos();
	}
}
