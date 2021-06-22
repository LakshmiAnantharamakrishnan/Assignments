package week3.day1;

public class SmartPhoneChild extends AndroidPhone {
	public void useWhatsapp()
	{
		System.out.println("Able to use whatsapp");
	}

	public static void main(String[] args) {
		
		
			SmartPhoneChild obj=new SmartPhoneChild();	
			obj.sendMsg();
			obj.makeCall();
			obj.takeVideo();
			obj.useWhatsapp();
			
		}

	}


