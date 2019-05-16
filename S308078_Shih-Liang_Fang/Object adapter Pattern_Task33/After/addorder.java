package Original;

public class addorder implements allpizza {

    private orginalpizza source;

    public addorder(orginalpizza source){
        super();
        this.source = source;
    }
    @Override
    public void newpizza() {
        System.out.println("this is the new Pizza!");
    }

    @Override
    public void Pizza1() {
        source.Pizza1();
    }
}