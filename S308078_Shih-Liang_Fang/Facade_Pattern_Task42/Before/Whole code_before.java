public class TurnON {
    public void startup(){
        System.out.println("cpu startup!");
        System.out.println("memory startup!");
        System.out.println("disk startup!");
        System.out.println("Turn on monitor!");
    }

    public void shutdown(){
        System.out.println("cpu shutdown!");
        System.out.println("memory shutdown!");
        System.out.println("disk shutdown!");
        System.out.println("Turn off monitor!");
    }
}

public class Computer {
    private TurnON turnon;

    public Computer(){
        turnon = new TurnON();
    }

    public void startup(){
        System.out.println("start the computer!");
        turnon.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        turnon.shutdown();
        System.out.println("computer closed!");
    }
}

public class UserTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
