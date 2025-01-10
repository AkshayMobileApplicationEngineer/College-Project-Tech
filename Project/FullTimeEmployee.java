class FullTimeEmployee extends Employee {
      private int hoursWorked;
      private double salary;
  
      public FullTimeEmployee(String name, int hoursWorked, double salary) {
          super(name);
          this.hoursWorked = hoursWorked;
          this.salary = salary;
      }
  
      @Override
      public double calculateSalary() {
          return salary; // Full-time employees usually have a fixed salary.
      }
  
      @Override
      public void displayDetails() {
          System.out.println("Full-Time Employee: " + name);
          System.out.println("Hours Worked: " + hoursWorked);
          System.out.println("Salary: " + salary);
      }
  }
  