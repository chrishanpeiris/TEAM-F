
class DogType {
    String dog;

    public String checkDogType(String type) {

        if (type == "small") {
            dog = "The poodle says \"arf\"";
        }

        else if (type == "big") {
            dog = "The Rottweiler says (in a very deep voice) \"WOOF!\"";
        }

        else if (type == "working") {
            dog = "The husky says \"Dude, what's up?\"";
        }
        System.out.println(dog);
        return dog;
    }

}

public class Dog {

    public static void main(String[] args) {
        DogType dogtype = new DogType();
        dogtype.checkDogType("small");
        dogtype.checkDogType("big");
        dogtype.checkDogType("working");
    }

}