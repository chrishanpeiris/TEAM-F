package Original;

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
