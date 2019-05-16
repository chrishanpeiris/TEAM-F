public interface allpizza {

    public void Pizza1();

    public void newpizza();
}
public abstract class NewPizza implements allpizza{

    public void Pizza1(){}
    public void newpizza(){}
}
public class orginalpizza {

    public void Pizza1() {
        System.out.println("this is original Pizza!");
    }
}
public class originalSub1 extends NewPizza {
    public void Pizza1(){
        System.out.println("the change of first Order!");
    }
}
public class originalSub2 extends NewPizza {
    public void newpizza(){
        System.out.println("the change of second Order!");
    }
}
public class PizzaOrderTest {

    public static void main(String[] args) {
        NewPizza source1 = new originalSub1();
        NewPizza source2 = new originalSub2();

        source1.Pizza1();
        source1.newpizza();
        source2.Pizza1();
        source2.newpizza();
    }
}
