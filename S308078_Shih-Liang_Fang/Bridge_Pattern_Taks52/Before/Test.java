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