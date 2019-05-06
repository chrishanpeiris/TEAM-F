class PersonDetails {
    private String name = "testUser";
    private String officeAreaCode = "0810";
    private String officeNumber = "8575485";
  
    public String getName() {
      return name;
    }
    public String getTelephoneNumber() {
      return ("(" + officeAreaCode + ") " + officeNumber);
    }
    public String getOfficeAreaCode() {
      return officeAreaCode;
    }
    public void setOfficeAreaCode(String arg) {
      officeAreaCode = arg;
    }
    public String getOfficeNumber() {
      return officeNumber;
    }
    public void setOfficeNumber(String arg) {
      officeNumber = arg;
    }
  }

public class Person {
  public static void main(String[] args) {
      PersonDetails persondetails = new PersonDetails();
      String name = persondetails.getName();
      String telpephone = persondetails.getTelephoneNumber();
      System.out.println("Person name = " + name);
      System.out.println("Telephone number = " + telpephone);
  }
}