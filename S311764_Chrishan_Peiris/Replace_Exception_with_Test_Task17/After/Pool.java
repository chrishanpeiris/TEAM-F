class ResourcePool {

    public void getResource() {
        int[] myNumbers = { 1, 2, 3 }; //define the array
        int position = 3;
        
        // use if else insted of using try catch - check the condition using if
        if (position <= 2) { 
            System.out.println(myNumbers[position]);
        }
        else {
            System.out.println("Something went wrong.");
        }

    }
}

public class Pool {
    public static void main(String[] args) {
        ResourcePool resourcepool = new ResourcePool(); // create an instance of ResourcePool object
        resourcepool.getResource(); // call the method via created instance
    }
}