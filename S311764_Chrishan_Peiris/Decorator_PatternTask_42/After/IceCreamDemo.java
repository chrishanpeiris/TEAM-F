
//created an interface to define the base of the icecream
interface Icecream {
    public String makeIcecream();
}

//implement the interface method by overring it
class SimpleIcecream implements Icecream {

    @Override
    public String makeIcecream() {
        return "Base Icecream";
    }

}

// implement the icecream base after overrided
class IcecreamDecorator implements Icecream {
    SimpleIcecream icecreamBase = new SimpleIcecream(); // instance of SimpleIcecream object
    String baseIcecream = icecreamBase.makeIcecream(); // keep the base icecream in a variable
    String decoration;
    String decoratedIcecream;

    //pass the base icecream into decorator
    public String addIcecreamDecorator(String base) {
        decoration = addNuts(); // add nuts
        decoratedIcecream =  base + decoration; // mix together
        return decoratedIcecream; // return the decorated icecream
    }

    public String addNuts() {
        return " + cruncy nuts";// nuts adding process
    }

    public String makeIcecream() {
        String finalIcecream = addIcecreamDecorator(baseIcecream);
        System.out.println(finalIcecream);
        return finalIcecream;
    }
}

public class IceCreamDemo {

    public static void main(String args[]) {
        IcecreamDecorator icecream = new IcecreamDecorator(); // created an instance of decorator
        icecream.makeIcecream(); // call to make a decorated icecream
    }

}