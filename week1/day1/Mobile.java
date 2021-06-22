package week1.day1;

public class Mobile {
	int number=9;
	
	public static void main(String[] args)
	{
		
// Creating object
	Mobile myPhone = new Mobile();
//	Calling method using object
	myPhone.makeCall();
	myPhone.sendMsg();
	myPhone.sendPhoto();
	}
// creating	method 1
		public void makeCall()
		
		{
			System.out.println("Calling My Friend");
//	creating method 2
		}
		public void sendMsg() {
			System.out.println("Sending a Message");
				
//creating method 3
		}
		public void sendPhoto() {
	System.out.println("sending a picture");
//	Creating an object to call method 1 -"Vivo " is object 
	Mobile vivo=new Mobile();
	vivo.makeCall();
	


		}
	
	}


