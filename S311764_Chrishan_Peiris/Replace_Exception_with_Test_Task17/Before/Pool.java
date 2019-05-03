class ResourcePool {
    private Stack available;
    private Stack allocated;

    public Resource getResource() {
        Resource result;
        try {
            result = (Resource) available.pop();
            allocated.push(result);
            return result;
        } catch (EmptyStackException e) {
            result = new Resource();
            allocated.push(result);
            return result;
        }
    }
}

public class Pool {
    public static void main(String[] args) {
        ResourcePool resourcepool = new ResourcePool();
        resourcepool.getResource();
    }
}