class Person {

    public String getManager() {
        // no need to have middle man to call the department object
        return "No midle man"; 
    }
}

class Department {

    public String getManagerFromDepartment() {
        String name = "Sam";
        System.out.println(name);
        return name;
    }

}

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        person.getManager();
        Department department = new Department(); // create an instance of department object
        department.getManagerFromDepartment(); // call the department rather than having a middle man
    }
}
