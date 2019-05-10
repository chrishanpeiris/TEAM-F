
class SimpleIcecream {

    public String makeIcecream() {
        return "Base Icecream";
    }

}

class IcecreamDecorator {

    public String addNuts() {
        return " + cruncy nuts";
    }
}

public class IceCreamDemo {

    public static void main(String args[]) {
        SimpleIcecream base = new SimpleIcecream();
        IcecreamDecorator decorator = new IcecreamDecorator();
        String baseicecream = base.makeIcecream();
        String decoration = decorator.addNuts();
        String icecream = baseicecream + decoration;

        System.out.println(icecream);
    }

}