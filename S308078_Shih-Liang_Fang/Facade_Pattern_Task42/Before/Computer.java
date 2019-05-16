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