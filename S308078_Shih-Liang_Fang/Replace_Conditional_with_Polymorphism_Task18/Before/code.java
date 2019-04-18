class Employee...

   int payAmount() {
       switch (getType()) {
           case EmployeeType.ENGINEER:
              return _monthlySalary;
           case EmployeeType.SALESMAN:
              return _monthlySalary + _commission;
           case EmployeeType.MANAGER:
              return _monthlySalary + _bonus;
           default:
              throw new RuntimeException("Incorrect Employee");
       }
   }

   int getType() {
       return _type.getTypeCode();
   }

   private EmployeeType _type;

 abstract class EmployeeType...

   abstract int getTypeCode();

 class Engineer extends EmployeeType...

   int getTypeCode() {
       return Employee.ENGINEER;
   }

 ... and other subclasses
