// Step 1. We can see that the found function work at two parts of this code
//         So, I created a function to call it.
  void checkSecurity(String[] people) {
      String found = foundMiscreant(people);
      someLaterCode(found);
  }
// Step 2. Removed the found in class.
  String foundMiscreant(String[] people){

      for (int i = 0; i < people.length; i++) {
          if (people[i].equals ("Don")){
             sendAlert();
             return "Don";
          }

          if (people[i].equals ("John")){
             sendAlert();
             return "John";
          }
      }
      return "";
  }