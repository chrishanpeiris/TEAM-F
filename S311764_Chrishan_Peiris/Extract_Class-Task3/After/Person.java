class PersonDetails {
  private String name = "testUser"; // variable for keep the username
  private TelephoneNumberDetails officeTelephone = new TelephoneNumberDetails(); // object instance for
                                                                                 // TelephoneNumberDetails class

  // method to return the name
  public String getName() {
    return name;
  }

  // method to returen office telephone number
  public TelephoneNumberDetails getOfficeTelephone() {
    return officeTelephone;
  }

  // method to returen telephone number from getTelephoneNumber method in
  // TelephoneNumberDetails class
  public String getTelephoneNumber() {
    return officeTelephone.getTelephoneNumber();
  }
}

// created a seperate class to extract telephone details
class TelephoneNumberDetails {
  private String officeAreaCode = "0810"; // extracted officeAreaCode variable
  private String officeNumber = "8575485"; // extracted officeNumber variable

  // extracted methods
  public String getOfficeAreaCode() {
    return officeAreaCode;
  }

  // extracted methods
  public void setOfficeAreaCode(String arg) {
    officeAreaCode = arg;
  }

  // extracted methods
  public String getOfficeNumber() {
    return officeNumber;
  }

  // extracted methods
  public void setOfficeNumber(String arg) {
    officeNumber = arg;
  }

  // extracted methods
  public String getTelephoneNumber() {
    return ("(" + officeAreaCode + ") " + officeNumber);
  }
}

public class Person {
  public static void main(String[] args) {
    PersonDetails persondetails = new PersonDetails(); // created an instance of PersonDetails class
    String name = persondetails.getName(); // access variables through created instance
    String telephone = persondetails.getTelephoneNumber(); // access variables through created instance
    System.out.println("Person name = " + name);
    System.out.println("Telephone number = " + telephone);
  }
}