// create object model in a seperate class
class StudentModel {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

// create object view in a separate class
class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student Details");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

}

// create controller in a seperate class
class StudentController {

    StudentModel model = new StudentModel(); // instance for the object model
    StudentView view = new StudentView(); // instance for the object view

    public void controller(String studentNumber, String StudentName) {
        model.setRollNo(studentNumber); // set the retrived student number through created model instance
        model.setName(StudentName); // set the retrived student name through created model instance
        String getStudentId = model.getRollNo(); // get the setted student ID and define a variable for that
        String getStudentName = model.getName();// get the setted student Name and define a variable for that

        view.printStudentDetails(getStudentId, getStudentName); // pass the data to the view
    }
}

class Student {
    public static void main(String[] args) {

        StudentController studentcontroller = new StudentController(); // instance for the controller object

        studentcontroller.controller("S300000", "Mark"); // call the controller via created instance

    }

}