// Step 1. payAmount founction from Employee move into EmployeeType
 class EmployeeType...

   int payAmount(Employee emp) {
       switch (getTypeCode()) {
           case ENGINEER:
              return emp.getMonthlySalary();
           case SALESMAN:
              return emp.getMonthlySalary() + emp.getCommission();
           case MANAGER:
              return emp.getMonthlySalary() + emp.getBonus();
           default:
              throw new RuntimeException("Incorrect Employee");
       }
   }

//Step 2. Change the way of call Employee
    class Employee...
   int payAmount() {
       return _type.payAmount(this);
   }

//Step 3. So, we can deal with switch statement.
 class Engineer...
   int payAmount(Employee emp) {
       return emp.getMonthlySalary();
   }
 class Salesman...

   int payAmount(Employee emp) {
       return emp.getMonthlySalary() + emp.getCommission();
   }

 class Manager...

   int payAmount(Employee emp) {
       return emp.getMonthlySalary() + emp.getBonus();
   }

  

 class EmployeeType...
   abstract int payAmount(Employee emp);