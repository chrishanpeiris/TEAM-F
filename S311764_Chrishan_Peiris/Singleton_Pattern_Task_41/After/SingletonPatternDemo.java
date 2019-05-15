class SingleObject {

    public void showMessage() {
        System.out.println("Message 1");
    }

    public void showMessage2() {
        System.out.println("Message 2");
    }

    public void showMessage3() {
        System.out.println("Message 3");
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
    
        SingleObject message1 = new SingleObject();
        SingleObject message2 = new SingleObject();
        SingleObject message3 = new SingleObject();

        message1.showMessage();
        message2.showMessage2();
        message3.showMessage3();
    }
}