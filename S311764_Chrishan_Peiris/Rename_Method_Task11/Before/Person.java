class PersonDetails {
    //…
    public String getTpNum() {
      String officeAreaCode = "084";
      String officeNumber = "55566855";
      return ("(" + officeAreaCode + ") " + officeNumber);
     
    }
  }
  

public class Person {
    public static void main(String[] args) {
        PersonDetails person = new PersonDetails();
        String details = person.getTpNum();
        System.out.println(details);
    }
}