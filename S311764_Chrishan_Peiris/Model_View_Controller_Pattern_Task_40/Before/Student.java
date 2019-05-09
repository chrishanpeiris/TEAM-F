class StudentInfo {
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

    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student Details");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

}

public class Student {
    public static void main(String[] args) {
        String name;
        String roleNumber;
        StudentInfo studentinfo = new StudentInfo();
        studentinfo.setRollNo("S300000");
        studentinfo.setName("Mark");
        name = studentinfo.getName();
        roleNumber = studentinfo.getRollNo();
        studentinfo.printStudentDetails(name, roleNumber);

    }
}