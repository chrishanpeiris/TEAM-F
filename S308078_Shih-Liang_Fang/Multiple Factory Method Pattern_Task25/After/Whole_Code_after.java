public interface Sender {
	public void Send();
}
public class MailSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is mail sender!");
	}
}
public class SmsSender implements Sender {
 
	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}
}
public class SendFactory {
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
}
public class FactoryTest {
 
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}