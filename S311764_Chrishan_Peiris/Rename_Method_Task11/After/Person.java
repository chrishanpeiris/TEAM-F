class PersonDetails {
    
    // provide a meaningful name to the method
    // since the varibles are related to office details, it is possible to provide a meaningful name as mentioned below
    public String getOfficeTelephoneNumber() {
      String officeAreaCode = "084";
      String officeNumber = "55566855";
      return ("(" + officeAreaCode + ") " + officeNumber);
     
    }
  }
  

public class Person {
    public static void main(String[] args) {
        PersonDetails person = new PersonDetails();
        String details = person.getOfficeTelephoneNumber();// call the renamed method
        System.out.println(details);
    }
}