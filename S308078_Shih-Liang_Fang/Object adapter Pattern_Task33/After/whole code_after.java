public interface allpizza {

    public void Pizza1();

    public void newpizza();
}
public class orginalpizza {

    public void Pizza1() {
        System.out.println("this is original Pizza!");
    }
}
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
public class PizzaOrderTest {

    public static void main(String[] args) {
        orginalpizza source = new orginalpizza();
        allpizza pizza = new addorder(source);
        pizza.Pizza1();
        pizza.newpizza();
    }
}