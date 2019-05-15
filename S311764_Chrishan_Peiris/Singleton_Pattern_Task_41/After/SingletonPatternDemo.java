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

        SingleObject message = new SingleObject();//created a single instance for accessing the singleObject class 

        message.showMessage();//call the methods via single instance
        message.showMessage2();//call the methods via single instance
        message.showMessage3();//call the methods via single instance
    }
}