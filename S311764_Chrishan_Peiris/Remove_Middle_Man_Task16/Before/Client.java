class Person {
    Department department = new Department();

    public void setDepartment(Department arg) {
        department = arg;
    }

    public String getManager() {
        String managerName = department.getManagerFromDepartment();
        System.out.println(managerName);
        return managerName;
    }
}

class Department {

    public String getManagerFromDepartment() {
        String name = "Sam";
        return name;
    }

}

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        person.getManager();
    }
}
