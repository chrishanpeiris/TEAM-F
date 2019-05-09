package Abstract;

public class Test {

    public static void main(String[] args) {
        Provider provider = new SendSmsFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}