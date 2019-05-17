public class FewViewBag {


    public void photo() {
        System.out.println("Bag's picture");
    }


    public void snippet() {
        System.out.println("Bag's brief introduction");
    }

}

public class FewViewBook {
    public void photo() {
        System.out.println("Book's picture");
    }


    public void snippet() {
        System.out.println("Book's brief introduction");
    }
}

public class FullViewBag {
    public void photo() {
        System.out.println("Bag's picture");
    }


    public void describe() {
        System.out.println("Bag's full introduction");
    }
}

public class FullViewBook {

    public void photo() {
        System.out.println("Book's picture");
    }


    public void describe() {
        System.out.println("Book's full introduction");
    }
}
public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        FewViewBag fewViewBag = new FewViewBag();
        System.out.println("---- Bag's brief introduction ----");
        fewViewBag.photo();
        fewViewBag.snippet();
        FullViewBag fullViewBag = new FullViewBag();
        System.out.println("---- Bag's full description ----");
        fullViewBag.photo();
        fullViewBag.describe();
        FewViewBook fewViewBook = new FewViewBook();
        System.out.println("---- Book's brief introduction ----");
        fewViewBook.photo();
        fewViewBook.snippet();
        FullViewBook fullViewBook = new FullViewBook();
        System.out.println("---- Book's full description ----");
        fullViewBook.photo();
        fullViewBook.describe();

    }
}