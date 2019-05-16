class CarEngine {

    public String airFlowController() {
        System.out.println("Air flow controller Normal and started");
        return "passed";
    }
    public String fuelInjector() {
        System.out.println("Fuel injector Normal and started");
        return "passed";
    }
    public String starter() {
        System.out.println("Starter Normal and started");
        return "passed";
    }
    public String coolingController() {
        System.out.println("Cooling controller Normal and started");
        return "passed";
    }
    public String catalyticConverter() {
        System.out.println("Catalytic converter Normal and started");
        return "passed";
    }
}


public class Car {
    public static void main(String[] args) {
        //start engine
        CarEngine engine = new CarEngine();
        engine.airFlowController();
        engine.fuelInjector();
        engine.starter();
        engine.coolingController();
        engine.catalyticConverter();
    }
}