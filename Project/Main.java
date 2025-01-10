public class Main {
      public static void main(String[] args) {
          PayrollSystem payrollSystem = new PayrollSystem(null);
          FullTimeEmployee emp1 = new FullTimeEmployee("Vikash", 52, 50000);
          PartTimeEmployee emp2 = new PartTimeEmployee("Rohit", 2, 6, 200);
  
          payrollSystem.addEmployee(emp1);
          payrollSystem.addEmployee(emp2);
  
          System.out.println("Initial Employee Details");
          payrollSystem.displayEmployee();
      }
  }
  