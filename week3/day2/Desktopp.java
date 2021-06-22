package week3.day2;

public class Desktopp  implements HardWare,SoftWare{

//	interface method implemented in class

	public void softwareResources() {
		System.out.println("iam a software resource");
		
	}

	//	interface method implemented in class
	public void hardwareResources() {
		System.out.println("iam a hardware resource");
		
//		method belonging to desktop class
	}
	public void desktopModel() {
		System.out.println("iam a desktop");
		
		
	}

	public static void main(String[] args) {
//		Desktopp is taken for reference and constructor is also taken from desktopp class
//		if HardWare is taken for refernce then methods present in HardWare will only be executed -Scope restriction
		Desktopp obj=new Desktopp();
		obj.hardwareResources();obj.softwareResources();
		obj.desktopModel();

		
	}
}
