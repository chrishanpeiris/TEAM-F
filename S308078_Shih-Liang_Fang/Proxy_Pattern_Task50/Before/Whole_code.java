public class orginalpizza {

    public void Pizza1() {
        System.out.println("this is original Pizza!");
    }
}
public interface allpizza {

    public void Pizza1();

    public void newpizza();
}
public class NewPizza extends orginalpizza implements allpizza {

    @Override
    public void newpizza() {
        System.out.println("this is the new Pizza!");
    }
}
public class PizzaOrderTest {

    public static void main(String[] args) {
        allpizza pizza = new NewPizza();
        pizza.Pizza1();
        pizza.newpizza();
    }
}