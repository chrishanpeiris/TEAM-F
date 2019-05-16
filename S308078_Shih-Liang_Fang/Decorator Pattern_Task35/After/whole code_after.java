public interface allpizza {

    public void Pizza1();

}
public class orginalpizza implements allpizza {

    public void Pizza1() {
        System.out.println("this is original Pizza!");
    }
}
public class addcheese implements allpizza {

    private allpizza cheese;

    public addcheese(allpizza source){
        super();
        this.cheese = source;
    }
    @Override
    public void Pizza1() {
        System.out.println("before add cheese!");
        cheese.Pizza1();
        System.out.println("after add cheese!");
    }
}
public class PizzaOrderTest {

    public static void main(String[] args) {
        allpizza cheese = new orginalpizza();
        allpizza obj = new addcheese(cheese);
        obj.Pizza1();
    }
}