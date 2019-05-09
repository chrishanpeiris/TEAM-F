class ResourcePool {

    public void getResource() {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }
}

public class Pool {
    public static void main(String[] args) {
        ResourcePool resourcepool = new ResourcePool();
        resourcepool.getResource();
    }
}